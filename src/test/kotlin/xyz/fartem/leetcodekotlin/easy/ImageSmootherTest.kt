package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertContentEquals

class ImageSmootherTest {
    private val solution = ImageSmoother()

    @Test
    fun testDefaultOne() {
        val correct = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0)
        )

        val result = solution.imageSmoother(
            arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 1)
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
            intArrayOf(137, 141, 137),
            intArrayOf(141, 138, 141),
            intArrayOf(137, 141, 137)
        )

        val result = solution.imageSmoother(
            arrayOf(
                intArrayOf(100, 200, 100),
                intArrayOf(200, 50, 200),
                intArrayOf(100, 200, 100)
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
