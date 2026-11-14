"""Bounded Instagram profile preview using Instaloader.

This bridge does not save credentials or download media. It returns post URLs
and thumbnail metadata for the existing Compose selection grid.
"""
import json
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
    limit = max(1, min(int(limit), 60))
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
        # Instaloader does not accept Netscape cookies.txt directly as a session.
        # Do not claim cookies-based authentication unless it is explicitly implemented.
        profile = instaloader.Profile.from_username(loader.context, username)
        items = []
        for post in profile.get_posts():
            if len(items) >= limit:
                break
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
        return json.dumps({"ok": True, "username": username, "items": items, "authenticated": False})
    except Exception as exc:
        return json.dumps({
            "ok": False,
            "username": username,
            "items": [],
            "authenticated": False,
            "error": "%s: %s" % (type(exc).__name__, str(exc)),
        })
