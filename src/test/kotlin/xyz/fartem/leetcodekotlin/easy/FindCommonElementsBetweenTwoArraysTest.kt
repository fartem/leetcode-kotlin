package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindCommonElementsBetweenTwoArraysTest {
    private val solution = FindCommonElementsBetweenTwoArrays()

    @Test
    fun testDefaultOne() {
        assertContentEquals(
            intArrayOf(2, 1),
            solution.findIntersectionValues(
                intArrayOf(2, 3, 2),
                intArrayOf(1, 2)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertContentEquals(
            intArrayOf(3, 4),
            solution.findIntersectionValues(
                intArrayOf(4, 3, 2, 3, 1),
                intArrayOf(2, 2, 5, 2, 3, 6)
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertContentEquals(
            intArrayOf(0, 0),
            solution.findIntersectionValues(
                intArrayOf(3, 4, 2, 3),
                intArrayOf(1, 5)
            )
        )
    }
}
