package xyz.fartem.leetcodekotlin.easy

class SubstringMatchingPattern {
    fun hasMatch(s: String, p: String): Boolean {
        val index = p.indexOf('*')
        val firstPart = s.indexOf(p.substring(0, index))
        val secondPart = s.indexOf(p.substring(index + 1), firstPart + index)

        return firstPart != -1 && secondPart != -1
    }
}
