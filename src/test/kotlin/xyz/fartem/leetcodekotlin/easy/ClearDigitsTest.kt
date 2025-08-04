package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class ClearDigitsTest {
    private val solution = ClearDigits()

    @Test
    fun testDefaultOne() {
        assertEquals(
            "abc",
            solution.clearDigits("abc")
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            "",
            solution.clearDigits("cb34")
        )
    }
}
