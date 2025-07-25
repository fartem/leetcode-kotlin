package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheSumOfEncryptedIntegersTest {
    private val solution = FindTheSumOfEncryptedIntegers()

    @Test
    fun testDefaultOne() {
        assertEquals(
            6,
            solution.sumOfEncryptedInt(
                intArrayOf(1, 2, 3)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            66,
            solution.sumOfEncryptedInt(
                intArrayOf(10, 21, 31)
            )
        )
    }
}
