package xyz.fartem.leetcodekotlin.easy

import kotlin.math.max
import kotlin.math.min

class NeitherMinimumNorMaximum {
    fun findNonMinOrMax(nums: IntArray): Int {
        if (nums.size < 3) {
            return -1
        }

        val a = min(nums[0], nums[1])
        val b = max(nums[0], nums[1])
        val c = nums[2]

        return when {
            c < b && c > a -> c
            c < a -> a
            c > b -> b
            else -> -1
        }
    }
}
