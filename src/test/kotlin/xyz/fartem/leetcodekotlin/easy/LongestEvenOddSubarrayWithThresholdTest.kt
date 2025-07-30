package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestEvenOddSubarrayWithThresholdTest {
    private val solution = LongestEvenOddSubarrayWithThreshold()

    @Test
    fun testDefaultOne() {
        assertEquals(
            3,
            solution.longestAlternatingSubarray(
                intArrayOf(3, 2, 5, 4),
                5
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            1,
            solution.longestAlternatingSubarray(
                intArrayOf(1, 2),
                2
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            3,
            solution.longestAlternatingSubarray(
                intArrayOf(2, 3, 4, 5),
                4
            )
        )
    }
}
