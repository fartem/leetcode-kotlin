package xyz.fartem.leetcodekotlin.easy

class FindTheKOrOfAnArray {
    fun findKOr(nums: IntArray, k: Int): Int {
        var result = 0

        for (i in 0 until 32) {
            val mask = 1 shl i
            val count = nums.count { it and mask != 0 }

            if (count >= k) {
                result = result or mask
            }
        }

        return result
    }
}
