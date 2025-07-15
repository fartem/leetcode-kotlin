package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SortMatrixByDiagonalsTest {
    private val solution = SortMatrixByDiagonals()

    @Test
    fun testDefaultOne() {
        val correct = arrayOf(
            intArrayOf(8, 2, 3),
            intArrayOf(9, 6, 7),
            intArrayOf(4, 5, 1)
        )

        val result = solution.sortMatrix(
            arrayOf(
                intArrayOf(1, 7, 3),
                intArrayOf(9, 8, 2),
                intArrayOf(4, 5, 6)
            )
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
        val correct = arrayOf(
            intArrayOf(2, 1),
            intArrayOf(1, 0)
        )

        val result = solution.sortMatrix(
            arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 2)
            )
        )

        for (i in 0 until correct.size) {
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }

    @Test
    fun testDefaultThree() {
        val correct = arrayOf(
            intArrayOf(1)
        )

        val result = solution.sortMatrix(
            arrayOf(
                intArrayOf(1)
            )
        )

        for (i in 0 until correct.size) {
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }
}
