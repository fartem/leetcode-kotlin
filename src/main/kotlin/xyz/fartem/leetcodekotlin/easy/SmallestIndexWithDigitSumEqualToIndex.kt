package xyz.fartem.leetcodekotlin.easy

class SmallestIndexWithDigitSumEqualToIndex {
    fun smallestIndex(nums: IntArray): Int {
        for (i in 0..nums.size - 1) {
            var sum = 0
            var num = nums[i]

            while (num != 0) {
                sum += num % 10
                num /= 10

                if (sum > i) {
                    break
                }
            }

            if (sum == i) {
                return i
            }
        }

        return -1
    }
}
