package xyz.fartem.leetcodekotlin.easy

class CountSubarraysOfLengthThreeWithACondition {
    fun countSubarrays(nums: IntArray): Int {
        var result = 0

        for (i in 0 until nums.size - 2) {
            val a = nums[i]
            val b = nums[i + 1]
            val c = nums[i + 2]

            if (b % 2 == 0 && a + c == b / 2) {
                result++
            }
        }

        return result
    }
}
