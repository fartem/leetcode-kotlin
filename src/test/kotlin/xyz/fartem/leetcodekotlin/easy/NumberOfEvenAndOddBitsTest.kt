package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertContentEquals

class NumberOfEvenAndOddBitsTest {
    private val solution = NumberOfEvenAndOddBits()

    @Test
    fun testDefaultOne() {
        assertContentEquals(
            intArrayOf(1, 2),
            solution.evenOddBit(50)
        )
    }

    @Test
    fun testDefaultTwo() {
        assertContentEquals(
            intArrayOf(0, 1),
            solution.evenOddBit(2)
        )
    }
}
