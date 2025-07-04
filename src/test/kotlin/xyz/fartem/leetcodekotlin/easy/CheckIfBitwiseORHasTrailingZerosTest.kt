package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckIfBitwiseORHasTrailingZerosTest {
    private val solution = CheckIfBitwiseORHasTrailingZeros()

    @Test
    fun testDefaultOne() {
        assertTrue {
            solution.hasTrailingZeros(
                intArrayOf(1, 2, 3, 4, 5)
            )
        }
    }

    @Test
    fun testDefaultTwo() {
        assertTrue {
            solution.hasTrailingZeros(
                intArrayOf(2, 4, 8, 16)
            )
        }
    }

    @Test
    fun testDefaultThree() {
        assertFalse {
            solution.hasTrailingZeros(
                intArrayOf(1, 3, 5, 7, 9)
            )
        }
    }
}
