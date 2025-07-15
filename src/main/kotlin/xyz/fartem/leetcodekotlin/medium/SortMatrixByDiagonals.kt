package xyz.fartem.leetcodekotlin.medium

class SortMatrixByDiagonals {
    fun sortMatrix(grid: Array<IntArray>): Array<IntArray> {
        val n = grid.size

        for (i in 0 until n) {
            val diagonal = mutableListOf<Int>()

            for (j in i until n) {
                diagonal.add(grid[j][j - i])
            }

            diagonal.sortDescending()

            for ((index, k) in (i until n).withIndex()) {
                grid[k][k - i] = diagonal[index]
            }
        }

        for (i in 1 until n) {
            val diagonal = mutableListOf<Int>()

            for (j in i until n) {
                diagonal.add(grid[j - i][j])
            }

            diagonal.sort()

            for ((index, k) in (i until n).withIndex()) {
                grid[k - i][k] = diagonal[index]
            }
        }

        return grid
    }
}
