package xyz.fartem.leetcodekotlin.easy

class NumberOfEvenAndOddBits {
    fun evenOddBit(n: Int): IntArray {
        return intArrayOf(
            Integer.bitCount(n and 0b0101010101),
            Integer.bitCount(n and 0b1010101010)
        )
    }
}
