package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class MaximumContainersOnAShipTest {
    private val solution = MaximumContainersOnAShip()

    @Test
    fun testDefaultOne() {
        assertEquals(
            4,
            solution.maxContainers(
                2, 3, 15
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            4,
            solution.maxContainers(
                3, 5, 20
            )
        )
    }
}
