package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class ZigzagConversionTest {
    private val solution = ZigzagConversion()

    @Test
    fun testDefaultOne() {
        assertEquals(
            "PAHNAPLSIIGYIR",
            solution.convert(
                "PAYPALISHIRING",
                3
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            "PINALSIGYAHRPI",
            solution.convert(
                "PAYPALISHIRING",
                4
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            "A",
            solution.convert(
                "A",
                1
            )
        )
    }
}
