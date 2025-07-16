package xyz.fartem.leetcodekotlin.medium

class SortVowelsInAString {

    companion object {
        private val vowels = setOf<Char>('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    }

    fun sortVowels(s: String): String {
        val inputVowels = s.filter { it in vowels }.toList().sorted()

        val result = StringBuilder()
        var vowelPointer = 0

        for (char in s) {
            if (char in vowels) {
                result.append(inputVowels[vowelPointer++])
            } else {
                result.append(char)
            }
        }

        return result.toString()
    }
}
