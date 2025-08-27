package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class CombinationSumIITest {
    private val solution = CombinationSumII()

    @Test
    fun testDefaultOne() {
        val correct = listOf(
            listOf(1, 1, 6),
            listOf(1, 2, 5),
            listOf(1, 7),
            listOf(2, 6)
        )

        val result = solution.combinationSum2(
            intArrayOf(10, 1, 2, 7, 6, 1, 5),
            8
        )

        for (i in correct.indices) {
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }

    @Test
    fun testDefaultTwo() {
        val correct = listOf(
            listOf(1, 2, 2),
            listOf(5)
        )

        val result = solution.combinationSum2(
            intArrayOf(2, 5, 2, 1, 2),
            5
        )

        for (i in correct.indices) {
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }
}
