package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class SmallestIndexWithDigitSumEqualToIndexTest {
    private val solution = SmallestIndexWithDigitSumEqualToIndex()

    @Test
    fun testDefaultOne() {
        assertEquals(
            2,
            solution.smallestIndex(
                intArrayOf(1, 3, 2)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            1,
            solution.smallestIndex(
                intArrayOf(1, 10, 11)
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            -1,
            solution.smallestIndex(
                intArrayOf(1, 2, 3)
            )
        )
    }
}
