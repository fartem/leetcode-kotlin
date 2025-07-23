package xyz.fartem.leetcodekotlin.easy

class FindTheMaximumDivisibilityScore {
    fun maxDivScore(nums: IntArray, divisors: IntArray): Int {
        var minDivisor = Int.MAX_VALUE
        var maxScore = 0

        for (divisor in divisors) {
            val score = nums.count { it % divisor == 0 }

            if (score > maxScore) {
                minDivisor = divisor
                maxScore = score
            } else if (score == maxScore && divisor < minDivisor) {
                minDivisor = divisor
            }
        }

        return minDivisor
    }
}
