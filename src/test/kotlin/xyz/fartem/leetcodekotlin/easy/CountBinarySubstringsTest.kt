package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class CountBinarySubstringsTest {
    private val solution = CountBinarySubstrings()

    @Test
    fun testDefaultOne() {
        assertEquals(
            6,
            solution.countBinarySubstrings(
                "00110011"
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            4,
            solution.countBinarySubstrings(
                "10101"
            )
        )
    }
}
