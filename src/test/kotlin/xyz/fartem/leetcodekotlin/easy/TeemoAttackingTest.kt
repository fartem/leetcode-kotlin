package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class TeemoAttackingTest {
    private val solution = TeemoAttacking()

    @Test
    fun testDefaultOne() {
        assertEquals(
            4,
            solution.findPoisonedDuration(
                intArrayOf(1, 4),
                2
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            3,
            solution.findPoisonedDuration(
                intArrayOf(1, 2),
                2
            )
        )
    }
}
