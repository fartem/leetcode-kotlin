package xyz.fartem.leetcodekotlin.easy

class DistributeCandies {
    fun distributeCandies(candyType: IntArray): Int {
        val maxEat = candyType.size / 2
        val uniqueTypes = candyType.toSet().size

        return minOf(maxEat, uniqueTypes)
    }
}
