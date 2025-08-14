package xyz.fartem.leetcodekotlin.easy

class RangeAdditionII {
    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
        if (ops.isEmpty()) {
            return m * n
        }

        var minA = Integer.MAX_VALUE
        var minB = Integer.MAX_VALUE

        for (op in ops) {
            minA = minOf(minA, op[0])
            minB = minOf(minB, op[1])
        }

        return minA * minB
    }
}
