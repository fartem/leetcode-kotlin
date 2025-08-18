package xyz.fartem.leetcodekotlin.easy

import DegreeOfAnArray
import kotlin.test.Test
import kotlin.test.assertEquals

class DegreeOfAnArrayTest {
    private val solution = DegreeOfAnArray()

    @Test
    fun testDefaultOne() {
        assertEquals(
            2,
            solution.findShortestSubArray(
                intArrayOf(1, 2, 2, 3, 1)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            6,
            solution.findShortestSubArray(
                intArrayOf(1, 2, 2, 3, 1, 4, 2)
            )
        )
    }
}
