package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class ReverseStringIITest {
    private val solution = ReverseStringII()

    @Test
    fun testDefaultOne() {
        assertEquals(
            "bacdfeg",
            solution.reverseStr(
                "abcdefg",
                2
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            "bacd",
            solution.reverseStr(
                "abcd",
                2
            )
        )
    }
}
