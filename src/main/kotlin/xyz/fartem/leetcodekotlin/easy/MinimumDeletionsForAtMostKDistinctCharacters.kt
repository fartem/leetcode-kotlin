package xyz.fartem.leetcodekotlin.easy

class MinimumDeletionsForAtMostKDistinctCharacters {
    fun minDeletion(s: String, k: Int): Int {
        val freq = s.groupingBy { it }.eachCount().values.sorted()
        val distinct = freq.size

        if (distinct <= k) {
            return 0
        }

        return freq.take(distinct - k).sum()
    }
}
