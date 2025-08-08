package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SubstringMatchingPatternTest {
    private val solution = SubstringMatchingPattern()

    @Test
    fun testDefaultOne() {
        assertTrue {
            solution.hasMatch(
                "leetcode",
                "ee*e"
            )
        }
    }

    @Test
    fun testDefaultTwo() {
        assertFalse {
            solution.hasMatch(
                "car",
                "c*v"
            )
        }
    }

    @Test
    fun testDefaultThree() {
        assertTrue {
            solution.hasMatch(
                "luck",
                "u*"
            )
        }
    }
}
