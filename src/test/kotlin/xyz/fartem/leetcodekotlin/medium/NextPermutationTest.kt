package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class NextPermutationTest {
    private val solution = NextPermutation()

    @Test
    fun testDefaultOne() {
        val result = intArrayOf(1, 2, 3)

        solution.nextPermutation(result)

        assertContentEquals(
            intArrayOf(1, 3, 2),
            result
        )
    }

    @Test
    fun testDefaultTwo() {
        val result = intArrayOf(3, 2, 1)

        solution.nextPermutation(result)

        assertContentEquals(
            intArrayOf(1, 2, 3),
            result
        )
    }

    @Test
    fun testDefaultThree() {
        val result = intArrayOf(1, 1, 5)

        solution.nextPermutation(result)

        assertContentEquals(
            intArrayOf(1, 5, 1),
            result
        )
    }
}
