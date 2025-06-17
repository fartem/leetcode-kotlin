package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumOperationsToMakeArraySumDivisibleByKTest {
    private val solution = MinimumOperationsToMakeArraySumDivisibleByK()

    @Test
    fun testDefaultOne() {
        assertEquals(
            4,
            solution.minOperations(
                intArrayOf(3, 9, 7),
                5
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            0,
            solution.minOperations(
                intArrayOf(4, 1, 3),
                4
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            5,
            solution.minOperations(
                intArrayOf(3, 2),
                6
            )
        )
    }
}
