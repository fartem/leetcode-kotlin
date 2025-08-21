package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FourSumTest {
    private val solution = FourSum()

    @Test
    fun testDefaultOne() {
        val correct = listOf(
            listOf(-2, -1, 1, 2),
            listOf(-2, 0, 0, 2),
            listOf(-1, 0, 0, 1)
        )

        val result = solution.fourSum(
            intArrayOf(1, 0, -1, 0, -2, 2),
            0
        )

        for (i in 0 until correct.size) {
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }

    @Test
    fun testDefaultTwo() {
        val correct = listOf(
            listOf(2, 2, 2, 2)
        )

        val result = solution.fourSum(
            intArrayOf(2, 2, 2, 2, 2),
            8
        )

        for (i in 0 until correct.size) {
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }
}
