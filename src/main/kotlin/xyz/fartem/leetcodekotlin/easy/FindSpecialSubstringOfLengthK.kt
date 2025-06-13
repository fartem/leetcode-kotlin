package xyz.fartem.leetcodekotlin.easy

class FindSpecialSubstringOfLengthK {
    fun hasSpecialSubstring(s: String, k: Int): Boolean {
        var count = 1

        for (i in 0 until s.length - 1) {
            when {
                s[i] == s[i + 1] -> count++
                count == k -> return true
                else -> count = 1
            }
        }

        return count == k
    }
}
