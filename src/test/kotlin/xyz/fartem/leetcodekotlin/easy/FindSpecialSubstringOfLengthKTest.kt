package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FindSpecialSubstringOfLengthKTest {
    private val solution = FindSpecialSubstringOfLengthK()

    @Test
    fun testDefaultOne() {
        assertTrue(
            solution.hasSpecialSubstring(
                "aaabaaa",
                3
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertFalse(
            solution.hasSpecialSubstring(
                "abc",
                2
            )
        )
    }
}
