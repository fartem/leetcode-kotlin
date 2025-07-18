package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class PalindromePartitioningTest {
    private val solution = PalindromePartitioning()

    @Test
    fun testDefaultOne() {
        val correct = listOf(
            listOf("a", "a", "b"),
            listOf("aa", "b")
        )

        val result = solution.partition("aab")

        for (i in 0 until correct.size) {
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }

    @Test
    fun testDefaultTwo() {
        val correct = listOf(
            listOf("a")
        )

        val result = solution.partition("a")

        for (i in 0 until correct.size) {
            assertContentEquals(
                correct[i],
                result[i]
            )
        }
    }
}
