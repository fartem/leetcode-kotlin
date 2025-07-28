package xyz.fartem.leetcodekotlin.easy

class FindTheWinningPlayerInCoinGame {
    fun winningPlayer(x: Int, y: Int): String {
        return if (minOf(x, y / 4) % 2 == 1) "Alice" else "Bob"
    }
}
