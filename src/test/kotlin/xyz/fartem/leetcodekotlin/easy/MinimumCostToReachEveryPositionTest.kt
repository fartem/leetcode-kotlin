package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MinimumCostToReachEveryPositionTest {
    private val solution = MinimumCostToReachEveryPosition()

    @Test
    fun testDefaultOne() {
        assertContentEquals(
            intArrayOf(5, 3, 3, 1, 1, 1),
            solution.minCosts(
                intArrayOf(5, 3, 4, 1, 3, 2)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertContentEquals(
            intArrayOf(1, 1, 1, 1, 1),
            solution.minCosts(
                intArrayOf(1, 2, 4, 6, 7)
            )
        )
    }
}
