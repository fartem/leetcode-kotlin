package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class AppleRedistributionIntoBoxesTest {
    private val solution = AppleRedistributionIntoBoxes()

    @Test
    fun testDefaultOne() {
        assertEquals(
            2,
            solution.minimumBoxes(
                intArrayOf(1, 3, 2),
                intArrayOf(4, 3, 1, 5, 2)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            4,
            solution.minimumBoxes(
                intArrayOf(5, 5, 5),
                intArrayOf(2, 4, 2, 7)
            )
        )
    }
}
