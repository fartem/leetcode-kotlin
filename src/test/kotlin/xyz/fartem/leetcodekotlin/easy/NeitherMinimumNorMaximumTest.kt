package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class NeitherMinimumNorMaximumTest {
    private val solution = NeitherMinimumNorMaximum()

    @Test
    fun testDefaultOne() {
        assertEquals(
            2,
            solution.findNonMinOrMax(
                intArrayOf(3, 2, 1, 4)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            -1,
            solution.findNonMinOrMax(
                intArrayOf(1, 2)
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            2,
            solution.findNonMinOrMax(
                intArrayOf(2, 1, 3)
            )
        )
    }
}
