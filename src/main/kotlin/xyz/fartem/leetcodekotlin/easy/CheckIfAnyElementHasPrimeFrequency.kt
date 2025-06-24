package xyz.fartem.leetcodekotlin.easy

class CheckIfAnyElementHasPrimeFrequency {
    fun checkPrimeFrequency(nums: IntArray): Boolean {
        return nums.groupBy { it }.any { it.value.size.isPrime() }
    }


    private fun Int.isPrime(): Boolean {
        if (this <= 1) {
            return false
        }

        for (i in 2..this - 1) {
            if (this % i == 0) {
                return false
            }
        }

        return true
    }
}
