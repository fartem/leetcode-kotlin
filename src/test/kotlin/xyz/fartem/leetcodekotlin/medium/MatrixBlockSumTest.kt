package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class MatrixBlockSumTest {
    private val solution = MatrixBlockSum()

    @Test
    fun testDefaultOne() {
        val correct = arrayOf(
            intArrayOf(12, 21, 16),
            intArrayOf(27, 45, 33),
            intArrayOf(24, 39, 28),
        )

        val result = solution.matrixBlockSum(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9),
            ),
            1
        )

        (0 until correct.size).forEach { i ->
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }

    @Test
    fun testDefaultTwo() {
        val correct = arrayOf(
            intArrayOf(45, 45, 45),
            intArrayOf(45, 45, 45),
            intArrayOf(45, 45, 45)
        )

        val result = solution.matrixBlockSum(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(4, 5, 6),
                intArrayOf(7, 8, 9)
            ),
            2
        )

        (0 until correct.size).forEach { i ->
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }
}
