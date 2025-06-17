package xyz.fartem.leetcodekotlin.easy

class MinimumOperationsToMakeArraySumDivisibleByK {
    fun minOperations(nums: IntArray, k: Int): Int {
        return nums.sum() % k
    }
}
