package easy

class MinimumAverageOfSmallestAndLargestElements {
    fun minimumAverage(nums: IntArray): Double {
        nums.sort()

        val n = nums.size
        var result = Double.MAX_VALUE

        for (i in 0..<n / 2) {
            val average = (nums[i] + nums[n - 1 - i]) / 2.0

            if (average < result) {
                result = average
            }
        }

        return result
    }
}
