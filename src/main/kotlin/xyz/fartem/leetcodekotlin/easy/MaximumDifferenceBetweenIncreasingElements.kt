package xyz.fartem.leetcodekotlin.easy

class MaximumDifferenceBetweenIncreasingElements {
    fun maximumDifference(nums: IntArray): Int {
        var min = nums[0]
        var diff = nums[1] - min

        nums.forEach { num ->
            when {
                num - min > diff -> diff = num - min
                min > num -> min = num
            }
        }

        return if (diff == 0) -1 else diff
    }
}
