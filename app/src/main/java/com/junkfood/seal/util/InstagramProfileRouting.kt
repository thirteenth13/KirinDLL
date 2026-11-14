package com.junkfood.seal.util

import java.net.URI

/** Routes Instagram profile URLs to gallery-dl, without intercepting post/reel links. */
object InstagramProfileRouting {
    private val username = Regex("^[A-Za-z0-9._]{1,30}$")
    private val reserved = setOf(
        "p", "reel", "reels", "tv", "stories", "explore", "accounts", "direct",
        "about", "developer", "api", "graphql", "challenge", "web", "legal"
    )

    fun isProfileUrl(raw: String): Boolean {
        val uri = runCatching { URI(raw.trim()) }.getOrNull() ?: return false
        if (uri.scheme?.lowercase() != "https") return false
        if (uri.host?.lowercase() !in setOf("instagram.com", "www.instagram.com")) return false
        if (uri.userInfo != null || uri.port != -1) return false
        val segments = uri.path.orEmpty().split('/').filter(String::isNotEmpty)
        return segments.size == 1 &&
            username.matches(segments[0]) &&
            segments[0].lowercase() !in reserved
    }
}
