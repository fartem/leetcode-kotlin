package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CheckIfAnyElementHasPrimeFrequencyTest {
    private val solution = CheckIfAnyElementHasPrimeFrequency()

    @Test
    fun testDefaultOne() {
        assertTrue {
            solution.checkPrimeFrequency(
                intArrayOf(1, 2, 3, 4, 5, 4),
            )
        }
    }

    @Test
    fun testDefaultTwo() {
        assertFalse {
            solution.checkPrimeFrequency(
                intArrayOf(1, 2, 3, 4, 5)
            )
        }
    }

    @Test
    fun testDefaultThree() {
        assertTrue {
            solution.checkPrimeFrequency(
                intArrayOf(2, 2, 2, 4, 4)
            )
        }
    }
}
