package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertContentEquals

class DistantBarcodesTest {
    private val solution = DistantBarcodes()

    @Test
    fun testDefaultOne() {
        assertContentEquals(
            intArrayOf(1, 2, 1, 2, 1, 2),
            solution.rearrangeBarcodes(
                intArrayOf(1, 1, 1, 2, 2, 2)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertContentEquals(
            intArrayOf(1, 3, 1, 2, 1, 2, 3, 1),
            solution.rearrangeBarcodes(
                intArrayOf(1, 1, 1, 1, 2, 2, 3, 3)
            )
        )
    }
}
