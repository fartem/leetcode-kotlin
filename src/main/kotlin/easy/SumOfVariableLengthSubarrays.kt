package easy

class SumOfVariableLengthSubarrays {
    fun subarraySum(nums: IntArray): Int {
        val n = nums.size
        val diff = IntArray(n)

        for (i in 0 until n) {
            val start = maxOf(0, i - nums[i])

            if (start <= i) {
                diff[start]++

                if (i + 1 < n) {
                    diff[i + 1]--
                }
            }
        }

        val count = IntArray(n)
        count[0] = diff[0]

        for (i in 1 until n) {
            count[i] = count[i - 1] + diff[i]
        }

        var result = 0

        for (i in 0 until n) {
            result += nums[i]* count[i]
        }

        return result
    }
}
