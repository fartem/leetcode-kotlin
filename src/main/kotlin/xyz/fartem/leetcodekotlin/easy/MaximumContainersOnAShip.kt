package xyz.fartem.leetcodekotlin.easy

import kotlin.math.min

class MaximumContainersOnAShip {
    fun maxContainers(n: Int, w: Int, maxWeight: Int): Int {
        return min(n * n, maxWeight / w)
    }
}

