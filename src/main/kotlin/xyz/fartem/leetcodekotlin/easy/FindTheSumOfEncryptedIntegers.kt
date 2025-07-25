package xyz.fartem.leetcodekotlin.easy

import kotlin.math.max

class FindTheSumOfEncryptedIntegers {
    fun sumOfEncryptedInt(nums: IntArray): Int {
        return nums.sumOf { num ->
            var maxDigit = 0
            var digitCount = 0
            var temp = num

            while (temp != 0) {
                maxDigit = max(maxDigit, temp % 10)
                digitCount += 1

                temp /= 10
            }

            var newNum = 0

            repeat(digitCount) {
                newNum = newNum * 10 + maxDigit
            }

            newNum
        }
    }
}
