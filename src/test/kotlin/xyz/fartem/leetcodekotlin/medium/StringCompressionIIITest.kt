package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class StringCompressionIIITest {
    private val solution = StringCompressionIII()

    @Test
    fun testDefaultOne() {
        assertEquals(
            "1a1b1c1d1e",
            solution.compressedString(
                "abcde"
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            "9a5a2b",
            solution.compressedString(
                "aaaaaaaaaaaaaabb"
            )
        )
    }
}
