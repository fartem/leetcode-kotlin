package xyz.fartem.leetcodekotlin.medium

class MatrixBlockSum {
    fun matrixBlockSum(mat: Array<IntArray>, k: Int): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size

        val prefix = Array(m + 1) { IntArray(n + 1) }

        for (i in 1..m) {
            for (j in 1..n) {
                prefix[i][j] = mat[i - 1][j - 1] +
                        prefix[i - 1][j] +
                        prefix[i][j - 1] -
                        prefix[i - 1][j - 1]
            }
        }

        val answer = Array(m) { IntArray(n) }

        for (i in 0 until m) {
            for (j in 0 until n) {
                val r1 = maxOf(0, i - k)
                val c1 = maxOf(0, j - k)
                val r2 = minOf(m - 1, i + k)
                val c2 = minOf(n - 1, j + k)

                answer[i][j] = prefix[r2 + 1][c2 + 1] -
                        prefix[r1][c2 + 1] -
                        prefix[r2 + 1][c1] +
                        prefix[r1][c1]
            }
        }

        return answer
    }
}
