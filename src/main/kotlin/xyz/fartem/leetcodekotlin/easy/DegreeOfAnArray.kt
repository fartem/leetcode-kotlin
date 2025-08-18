class DegreeOfAnArray {
    fun findShortestSubArray(nums: IntArray): Int {
        val firstOccurrence = mutableMapOf<Int, Int>()
        val lastOccurrence = mutableMapOf<Int, Int>()
        val frequency = mutableMapOf<Int, Int>()
        var maxFrequency = 0

        for ((index, num) in nums.withIndex()) {
            if (num !in firstOccurrence) {
                firstOccurrence[num] = index
            }

            lastOccurrence[num] = index
            frequency[num] = frequency.getOrDefault(num, 0) + 1
            maxFrequency = maxOf(maxFrequency, frequency[num]!!)
        }

        var result = Int.MAX_VALUE

        for ((num, count) in frequency) {
            if (count == maxFrequency) {
                val length = lastOccurrence[num]!! - firstOccurrence[num]!! + 1

                if (length < result) {
                    result = length
                }
            }
        }

        return result
    }
}
