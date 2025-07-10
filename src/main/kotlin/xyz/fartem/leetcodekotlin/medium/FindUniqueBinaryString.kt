package xyz.fartem.leetcodekotlin.medium

class FindUniqueBinaryString {
    fun findDifferentBinaryString(nums: Array<String>): String {
        val result = StringBuilder()

        for (i in 0..nums.size - 1) {
            val curr = nums[i][i]
            result.append(if (curr == '0') '1' else '0')
        }

        return result.toString()
    }
}
