package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class SortVowelsInAStringTest {
    private val solution = SortVowelsInAString()

    @Test
    fun testDefaultOne() {
        assertEquals(
            "lEOtcede",
            solution.sortVowels(
                "lEetcOde"
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            "lYmpH",
            solution.sortVowels(
                "lYmpH"
            )
        )
    }
}
