package xyz.fartem.leetcodekotlin.easy

class SumOfGoodNumbers {
    fun sumOfGoodNumbers(nums: IntArray, k: Int): Int {
        var result = 0

        nums.forEachIndexed { i, num ->
            val left = if (i - k >= 0) nums[i - k] else Int.MIN_VALUE
            val right = if (i + k < nums.size) nums[i + k] else Int.MIN_VALUE

            if (num > left && num > right) {
                result += num
            }
        }

        return result
    }
}
