package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckDivisibilityByDigitSumAndProductTest {
    private val solution = CheckDivisibilityByDigitSumAndProduct()

    @Test
    fun testDefaultOne() {
        assertTrue {
            solution.checkDivisibility(99)
        }
    }

    @Test
    fun testDefaultTwo() {
        assertFalse {
            solution.checkDivisibility(23)
        }
    }
}
