package xyz.fartem.leetcodekotlin.easy

import kotlin.math.min

class MinimumCostToReachEveryPosition {
    fun minCosts(cost: IntArray): IntArray {
        val result = IntArray(cost.size)
        var curr = Integer.MAX_VALUE

        for (i in 0 until cost.size) {
            curr = min(curr, cost[i])

            result[i] = curr
        }

        return result
    }
}
