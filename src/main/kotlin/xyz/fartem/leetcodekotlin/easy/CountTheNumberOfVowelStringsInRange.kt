package xyz.fartem.leetcodekotlin.easy

class CountTheNumberOfVowelStringsInRange {

    companion object {
        private val vowels = setOf('a', 'e', 'i', 'o', 'u')
    }

    fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
        return (left..right).count { i ->
            vowels.contains(words[i].first()) && vowels.contains(words[i].last())
        }
    }
}
