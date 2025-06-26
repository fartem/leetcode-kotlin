package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class SumOfGoodNumbersTest {
    private val solution = SumOfGoodNumbers()

    @Test
    fun testDefaultOne() {
        assertEquals(
            12,
            solution.sumOfGoodNumbers(
                intArrayOf(1, 3, 2, 1, 5, 4),
                2
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            2,
            solution.sumOfGoodNumbers(
                intArrayOf(2, 1),
                1
            )
        )
    }
}
