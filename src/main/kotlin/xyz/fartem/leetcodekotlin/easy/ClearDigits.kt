package xyz.fartem.leetcodekotlin.easy

class ClearDigits {
    fun clearDigits(s: String): String {
        val result = StringBuilder()

        s.forEach { c ->
            if (c.isDigit()) {
                if (result.isNotEmpty() && result.last().isLetter()) {
                    result.deleteAt(result.length - 1)
                }
            } else {
                result.append(c)
            }
        }

        return result.toString()
    }
}
