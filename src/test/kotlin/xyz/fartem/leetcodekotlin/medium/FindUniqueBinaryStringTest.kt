package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class FindUniqueBinaryStringTest {
    private val solution = FindUniqueBinaryString()

    @Test
    fun testDefaultOne() {
        assertEquals(
            "11",
            solution.findDifferentBinaryString(
                arrayOf("01", "10")
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            "10",
            solution.findDifferentBinaryString(
                arrayOf("00", "01")
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            "000",
            solution.findDifferentBinaryString(
                arrayOf("111", "011", "001")
            )
        )
    }
}
