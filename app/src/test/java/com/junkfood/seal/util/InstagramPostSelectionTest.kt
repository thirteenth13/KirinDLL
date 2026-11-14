package com.junkfood.seal.util

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class InstagramPostSelectionTest {
    @Test fun normalizesPostAndDropsTrackingParameters() {
        assertEquals("https://www.instagram.com/p/Ab_12-/", InstagramPostSelection.canonicalPostUrl("https://instagram.com/p/Ab_12-/?igsh=xyz"))
    }

    @Test fun rejectsUntrustedAndNonPostUrls() {
        listOf(
            "https://instagram.com.evil.example/p/abc/",
            "http://instagram.com/p/abc/",
            "https://www.instagram.com/example/",
            "https://www.instagram.com/p/",
            "https://www.instagram.com/p/abc/extra/",
            "javascript:alert(1)"
        ).forEach { assertNull(it, InstagramPostSelection.canonicalPostUrl(it)) }
    }

    @Test fun togglesAndDeduplicatesSelection() {
        val post = "https://www.instagram.com/p/abc/"
        assertEquals(setOf(post), InstagramPostSelection.toggle(emptySet(), post))
        assertEquals(emptySet<String>(), InstagramPostSelection.toggle(setOf(post), post))
        assertEquals(listOf(post), InstagramPostSelection.queueUrls(setOf(post, "https://instagram.com/p/abc/?x=1")))
    }

    @Test fun selectAllSkipsProfilesAndDuplicates() {
        assertEquals(
            setOf("https://www.instagram.com/p/abc/", "https://www.instagram.com/reel/xyz/"),
            InstagramPostSelection.selectAll(listOf("https://instagram.com/p/abc/", "https://www.instagram.com/p/abc/?x=1", "https://instagram.com/reel/xyz/", "https://instagram.com/user/"))
        )
    }
}
