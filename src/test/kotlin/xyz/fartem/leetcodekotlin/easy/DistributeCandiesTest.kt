package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class DistributeCandiesTest {
    private val solution = DistributeCandies()

    @Test
    fun testDefaultOne() {
        assertEquals(
            3,
            solution.distributeCandies(
                intArrayOf(1, 1, 2, 2, 3, 3)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            2,
            solution.distributeCandies(
                intArrayOf(1, 1, 2, 3)
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            1,
            solution.distributeCandies(
                intArrayOf(6, 6, 6, 6)
            )
        )
    }
}
