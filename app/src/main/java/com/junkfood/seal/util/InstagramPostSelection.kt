package com.junkfood.seal.util

import java.net.URI

/**
 * Pure selection state for an Instagram post grid. This does not fetch Instagram content.
 * Only post/reel URLs are accepted; profile and CDN URLs cannot enter the download queue.
 */
object InstagramPostSelection {
    private val shortcode = Regex("^[A-Za-z0-9_-]+$")

    fun canonicalPostUrl(raw: String): String? {
        val uri = runCatching { URI(raw.trim()) }.getOrNull() ?: return null
        if (uri.scheme?.lowercase() != "https") return null
        val host = uri.host?.lowercase() ?: return null
        if (host != "instagram.com" && host != "www.instagram.com") return null
        val parts = uri.path.orEmpty().split('/').filter(String::isNotBlank)
        if (parts.size != 2 || parts[0] !in setOf("p", "reel", "tv")) return null
        if (!shortcode.matches(parts[1])) return null
        return "https://www.instagram.com/${parts[0]}/${parts[1]}/"
    }

    fun toggle(selected: Set<String>, rawUrl: String): Set<String> {
        val url = canonicalPostUrl(rawUrl) ?: return selected
        return if (url in selected) selected - url else selected + url
    }

    fun selectAll(rawUrls: Iterable<String>): Set<String> =
        rawUrls.mapNotNull(::canonicalPostUrl).toSet()

    fun queueUrls(selected: Set<String>): List<String> =
        selected.mapNotNull(::canonicalPostUrl).distinct().sorted()
}
