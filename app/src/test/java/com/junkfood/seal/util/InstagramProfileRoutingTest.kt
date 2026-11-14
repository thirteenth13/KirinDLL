package com.junkfood.seal.util

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class InstagramProfileRoutingTest {
    @Test fun recognizesProfiles() {
        assertTrue(InstagramProfileRouting.isProfileUrl("https://www.instagram.com/annzolotar31/"))
        assertTrue(InstagramProfileRouting.isProfileUrl("https://instagram.com/example.name/?hl=en"))
    }

    @Test fun doesNotInterceptMediaOrOtherSites() {
        listOf(
            "https://www.instagram.com/p/abc/",
            "https://www.instagram.com/reel/abc/",
            "https://www.instagram.com/stories/example/",
            "https://www.instagram.com/explore/",
            "https://instagram.com.evil.example/example/",
            "http://instagram.com/example/",
            "https://www.instagram.com@example.org/",
            "https://www.instagram.com:8443/example/"
        ).forEach { assertFalse(it, InstagramProfileRouting.isProfileUrl(it)) }
    }
}
