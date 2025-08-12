package xyz.fartem.leetcodekotlin.easy

import kotlin.math.min

class ReverseStringII {
    fun reverseStr(s: String, k: Int): String {
        val chars = s.toCharArray()

        for (i in s.indices step 2 * k) {
            var left = i
            var right = min(i + k - 1, chars.lastIndex)

            while (left < right) {
                val temp = chars[left]
                chars[left++] = chars[right]
                chars[right--] = temp
            }
        }

        return String(chars)
    }
}
