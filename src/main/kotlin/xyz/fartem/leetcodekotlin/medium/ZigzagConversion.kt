package xyz.fartem.leetcodekotlin.medium

class ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) {
            return s
        }

        val rows = Array(numRows) { StringBuilder() }
        var curr = 0
        var down = false

        for (c in s) {
            rows[curr].append(c)

            if (curr == 0 || curr == numRows - 1) {
                down = !down
            }

            curr += if (down) 1 else -1
        }

        return rows.joinToString("")
    }
}
