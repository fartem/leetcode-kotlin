package xyz.fartem.leetcodekotlin.easy

class CanPlaceFlowers {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var i = 0
        var remaining = n
        val size = flowerbed.size

        while (i < size && remaining > 0) {
            if (flowerbed[i] == 0) {
                val next = if (i == size - 1) 0 else flowerbed[i + 1]
                val prev = if (i == 0) 0 else flowerbed[i - 1]

                if (prev == 0 && next == 0) {
                    remaining--
                    i += 2

                    continue
                }
            }

            i++
        }

        return remaining <= 0
    }
}
