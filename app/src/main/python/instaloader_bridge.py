"""Bounded Instagram profile preview using Instaloader.

The bridge returns preview metadata and downloads selected posts into a private job directory.
"""
import json
from http.cookiejar import MozillaCookieJar
import re
from urllib.parse import urlsplit

_PROFILE = re.compile(r"^[A-Za-z0-9._]{1,30}$")
_RESERVED = {"p", "reel", "reels", "tv", "stories", "explore", "accounts", "direct"}


def _username(url):
    parts = urlsplit(url.strip())
    if parts.scheme != "https" or parts.hostname not in ("instagram.com", "www.instagram.com"):
        raise ValueError("Expected an HTTPS Instagram profile URL")
    if parts.username or parts.password or parts.port is not None:
        raise ValueError("Invalid Instagram profile URL")
    segments = [p for p in parts.path.split("/") if p]
    if len(segments) != 1 or not _PROFILE.fullmatch(segments[0]) or segments[0].lower() in _RESERVED:
        raise ValueError("Expected an Instagram profile, not a post or reel")
    return segments[0]


def preview_profile(url, limit=36, cookies_path=""):
    """Return JSON for a limited preview. No session or cookie files are persisted."""
    username = _username(url)
    limit = max(1, min(int(limit), 360))
    try:
        import instaloader

        loader = instaloader.Instaloader(
            download_pictures=False,
            download_videos=False,
            download_video_thumbnails=False,
            download_geotags=False,
            download_comments=False,
            save_metadata=False,
            compress_json=False,
            quiet=True,
        )
        authenticated = False
        if cookies_path:
            jar = MozillaCookieJar(cookies_path)
            jar.load(ignore_discard=True, ignore_expires=False)
            for cookie in jar:
                if cookie.domain.lstrip(".").lower() in ("instagram.com", "www.instagram.com"):
                    loader.context._session.cookies.set_cookie(cookie)
            username_session = loader.test_login()
            if username_session:
                loader.context.username = username_session
                authenticated = True
        profile = instaloader.Profile.from_username(loader.context, username)
        items = []
        from itertools import islice
        for post in islice(profile.get_posts(), limit):
            shortcode = str(post.shortcode)
            if not re.fullmatch(r"[A-Za-z0-9_-]+", shortcode):
                continue
            items.append({
                "id": shortcode,
                "title": str(post.caption or "")[:120] or shortcode,
                "url": "https://www.instagram.com/p/%s/" % shortcode,
                "thumbnail": str(post.url),
                "creator": username,
            })
        return json.dumps({"ok": True, "username": username, "items": items, "authenticated": authenticated, "total": profile.mediacount})
    except Exception as exc:
        return json.dumps({
            "ok": False,
            "username": username,
            "items": [],
            "authenticated": False,
            "error": "Instagram profile unavailable (%s)" % type(exc).__name__,
        })


def download_post(url, output_dir, cookies_path="", media_filter="media"):
    import os
    import shutil
    import tempfile
    from pathlib import Path

    stage = None
    try:
        parts = urlsplit(url.strip())
        segments = [p for p in parts.path.split("/") if p]
        if (parts.scheme != "https" or parts.hostname not in ("instagram.com", "www.instagram.com")
                or parts.username or parts.password or parts.port is not None
                or len(segments) != 2 or segments[0] not in ("p", "reel", "tv")
                or not re.fullmatch(r"[A-Za-z0-9_-]+", segments[1])):
            return json.dumps({"ok": False, "error": "Invalid Instagram post URL"})
        import instaloader
        stage = Path(tempfile.mkdtemp(prefix="post-", dir=output_dir))
        loader = instaloader.Instaloader(
            dirname_pattern=str(stage), filename_pattern="{shortcode}",
            download_pictures=media_filter != "videos",
            download_videos=media_filter != "images",
            download_video_thumbnails=False, download_geotags=False,
            download_comments=False, save_metadata=False, compress_json=False,
            post_metadata_txt_pattern="", quiet=True,
            max_connection_attempts=2, request_timeout=30,
        )
        authenticated = False
        if cookies_path:
            jar = MozillaCookieJar(cookies_path)
            jar.load(ignore_discard=True, ignore_expires=False)
            for cookie in jar:
                if cookie.domain.lstrip(".").lower() in ("instagram.com", "www.instagram.com"):
                    loader.context._session.cookies.set_cookie(cookie)
            account = loader.test_login()
            if account:
                loader.context.username = account
                authenticated = True
        post = instaloader.Post.from_shortcode(loader.context, segments[1])
        loader.download_post(post, target=str(stage))
        files = [str(p.resolve()) for p in stage.rglob("*")
                 if p.is_file() and p.suffix.lower() in (".jpg", ".jpeg", ".png", ".webp", ".mp4")]
        if not files:
            raise ValueError("No matching media")
        return json.dumps({"ok": True, "files": files, "extractor": "instagram / post",
                           "cookies_loaded": authenticated, "config_loaded": False})
    except Exception as exc:
        if stage is not None:
            shutil.rmtree(stage, ignore_errors=True)
        return json.dumps({"ok": False, "error": "Instagram download unavailable (%s)" % type(exc).__name__})
