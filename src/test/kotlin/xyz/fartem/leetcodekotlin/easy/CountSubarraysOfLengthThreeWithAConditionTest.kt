package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class CountSubarraysOfLengthThreeWithAConditionTest {
    private val solution = CountSubarraysOfLengthThreeWithACondition()

    @Test
    fun testDefaultOne() {
        assertEquals(
            1,
            solution.countSubarrays(
                intArrayOf(1, 2, 1, 4, 1)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            0,
            solution.countSubarrays(
                intArrayOf(1, 1, 1)
            )
        )
    }
}
