package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class CountTheNumberOfVowelStringsInRangeTest {
    private val solution = CountTheNumberOfVowelStringsInRange()

    @Test
    fun testDefaultOne() {
        assertEquals(
            2,
            solution.vowelStrings(
                arrayOf("are", "amy", "u"),
                0,
                2
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            3,
            solution.vowelStrings(
                arrayOf("hey", "aeo", "mu", "ooo", "artro"),
                1,
                4
            )
        )
    }
}
