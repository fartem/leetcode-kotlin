package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheMaximumDivisibilityScoreTest {
    private val solution = FindTheMaximumDivisibilityScore()

    @Test
    fun testDefaultOne() {
        assertEquals(
            2,
            solution.maxDivScore(
                intArrayOf(2, 9, 15, 50),
                intArrayOf(5, 3, 7, 2)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            3,
            solution.maxDivScore(
                intArrayOf(4, 7, 9, 3, 9),
                intArrayOf(5, 2, 3)
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            10,
            solution.maxDivScore(
                intArrayOf(20, 14, 21, 10),
                intArrayOf(10, 16, 20)
            )
        )
    }
}
