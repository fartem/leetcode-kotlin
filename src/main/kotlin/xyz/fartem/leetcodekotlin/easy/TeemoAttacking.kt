package xyz.fartem.leetcodekotlin.easy

import kotlin.math.min

class TeemoAttacking {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        if (timeSeries.isEmpty()) {
            return 0
        }

        var total = 0

        for (i in 0 until timeSeries.size - 1) {
            total += min(duration, timeSeries[i + 1] - timeSeries[i])
        }

        return total + duration
    }
}
