package xyz.fartem.leetcodekotlin.easy

class CheckIfBitwiseORHasTrailingZeros {
    fun hasTrailingZeros(nums: IntArray): Boolean {
        return nums.count { it and 1 == 0 } > 1
    }
}
