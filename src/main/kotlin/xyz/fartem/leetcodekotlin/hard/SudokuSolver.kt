package xyz.fartem.leetcodekotlin.hard

class SudokuSolver {
    fun solveSudoku(board: Array<CharArray>) {
        solve(board)
    }

    private fun solve(board: Array<CharArray>): Boolean {
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == '.') {
                    for (c in '1'..'9') {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c

                            if (solve(board)) {
                                return true
                            } else {
                                board[i][j] = '.'
                            }
                        }
                    }

                    return false
                }
            }
        }

        return true
    }

    private fun isValid(board: Array<CharArray>, row: Int, col: Int, c: Char): Boolean {
        for (i in 0 until 9) {
            if (board[row][i] == c) {
                return false
            }
        }

        for (i in 0 until 9) {
            if (board[i][col] == c) {
                return false
            }
        }

        val boxRow = 3 * (row / 3)
        val boxCol = 3 * (col / 3)

        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (board[boxRow + i][boxCol + j] == c) {
                    return false
                }
            }
        }

        return true
    }
}
