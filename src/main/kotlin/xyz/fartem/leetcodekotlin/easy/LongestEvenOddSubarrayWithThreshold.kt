package xyz.fartem.leetcodekotlin.easy

import kotlin.math.max

class LongestEvenOddSubarrayWithThreshold {
    fun longestAlternatingSubarray(nums: IntArray, threshold: Int): Int {
        var result = 0

        for (l in 0 until nums.size) {
            if (nums[l] % 2 == 0 && nums[l] <= threshold) {
                var r = l

                while (r + 1 < nums.size && nums[r] % 2 != nums[r + 1] % 2 && nums[r + 1] <= threshold) {
                    r++
                }

                result = max(result, r  - l + 1)
            }
        }

        return result
    }
}
