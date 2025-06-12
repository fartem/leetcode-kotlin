package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class SumOfVariableLengthSubarraysTest {
    private val solution = SumOfVariableLengthSubarrays()

    @Test
    fun testDefaultOne() {
        assertEquals(
            11,
            solution.subarraySum(
                intArrayOf(2, 3, 1)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            13,
            solution.subarraySum(
                intArrayOf(3, 1, 1, 2)
            )
        )
    }
}
