package xyz.fartem.leetcodekotlin.easy

class CheckDivisibilityByDigitSumAndProduct {
    fun checkDivisibility(n: Int): Boolean {
        var sum = 0
        var product = 1
        var num = n

        while (num != 0) {
            val digit = num % 10

            sum += digit
            product *= digit

            num /= 10
        }

        return n % (sum + product) == 0
    }
}
