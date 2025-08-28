package xyz.fartem.leetcodekotlin.hard

import kotlin.test.Test
import kotlin.test.assertEquals

class TrappingRainWaterTest {
    private val solution = TrappingRainWater()

    @Test
    fun testDefaultOne() {
        assertEquals(
            6,
            solution.trap(
                intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            9,
            solution.trap(
                intArrayOf(4, 2, 0, 3, 2, 5)
            )
        )
    }
}
