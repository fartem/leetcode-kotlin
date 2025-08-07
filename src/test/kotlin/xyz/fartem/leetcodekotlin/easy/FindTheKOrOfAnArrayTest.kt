package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheKOrOfAnArrayTest {
    private val solution = FindTheKOrOfAnArray()

    @Test
    fun testDefaultOne() {
        assertEquals(
            9,
            solution.findKOr(
                intArrayOf(7, 12, 9, 8, 9, 15),
                4
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            0,
            solution.findKOr(
                intArrayOf(2, 12, 1, 11, 4, 5),
                6
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            15,
            solution.findKOr(
                intArrayOf(10, 8, 5, 9, 11, 6, 8),
                1
            )
        )
    }
}
