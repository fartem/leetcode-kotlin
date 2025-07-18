package xyz.fartem.leetcodekotlin.medium

class PalindromePartitioning {
    fun partition(s: String): List<List<String>> {
        val result = mutableListOf<List<String>>()
        backtrack(s, 0, mutableListOf(), result)

        return result
    }

    private fun backtrack(
        s: String,
        start: Int,
        current: MutableList<String>,
        result: MutableList<List<String>>
    ) {
        if (start >= s.length) {
            result.add(ArrayList(current))

            return
        }

        for (end in start until s.length) {
            if (isPalindrome(s, start, end)) {
                current.add(s.substring(start, end + 1))
                backtrack(s, end + 1, current, result)
                current.removeAt(current.size - 1)
            }
        }
    }

    private fun isPalindrome(
        s: String,
        left: Int,
        right: Int
    ): Boolean {
        var l = left
        var r = right

        while (l < r) {
            if (s[l] != s[r]) {
                return false
            }

            l++
            r--
        }

        return true
    }
}
