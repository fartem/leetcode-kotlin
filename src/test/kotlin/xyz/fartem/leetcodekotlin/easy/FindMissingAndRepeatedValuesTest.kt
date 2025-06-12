package xyz.fartem.leetcodekotlin.easy

import kotlin.arrayOf
import kotlin.test.Test
import kotlin.test.assertContentEquals

class FindMissingAndRepeatedValuesTest {
    private val solution = FindMissingAndRepeatedValues()

    @Test
    fun testDefaultOne() {
        assertContentEquals(
            intArrayOf(2, 4),
            solution.findMissingAndRepeatedValues(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(2, 2)
                )
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertContentEquals(
            intArrayOf(9, 5),
            solution.findMissingAndRepeatedValues(
                arrayOf(
                    intArrayOf(9, 1, 7),
                    intArrayOf(8, 9, 2),
                    intArrayOf(3, 4, 6)
                )
            )
        )
    }
}
