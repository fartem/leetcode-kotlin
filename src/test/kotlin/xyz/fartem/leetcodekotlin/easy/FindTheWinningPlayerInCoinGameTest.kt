package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class FindTheWinningPlayerInCoinGameTest {
    private val solution = FindTheWinningPlayerInCoinGame()

    @Test
    fun testDefaultOne() {
        assertEquals(
            "Alice",
            solution.winningPlayer(2, 7)
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            "Bob",
            solution.winningPlayer(4, 11)
        )
    }
}
