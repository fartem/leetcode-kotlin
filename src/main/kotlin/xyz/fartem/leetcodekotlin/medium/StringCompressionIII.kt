package xyz.fartem.leetcodekotlin.medium

class StringCompressionIII {
    fun compressedString(word: String): String {
        val result = StringBuilder()
        var i = 0

        while (i < word.length) {
            val c = word[i]
            var count = 0

            while (count < 9 && i + count < word.length && word[i + count] == c) {
                count++
            }

            result.append(count).append(c)

            i += count
        }

        return result.toString()
    }
}
