package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumDifferenceBetweenIncreasingElementsTest {
    private val solution = MaximumDifferenceBetweenIncreasingElements()

    @Test
    fun testDefaultOne() {
        assertEquals(
            4,
            solution.maximumDifference(
                intArrayOf(7, 1, 5, 4)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            -1,
            solution.maximumDifference(
                intArrayOf(9, 4, 3, 2)
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            9,
            solution.maximumDifference(
                intArrayOf(1, 5, 2, 10)
            )
        )
    }
}
