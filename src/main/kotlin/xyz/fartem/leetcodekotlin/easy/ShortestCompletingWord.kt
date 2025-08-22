package xyz.fartem.leetcodekotlin.easy

class ShortestCompletingWord {
    fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
        val licenseFreq = mutableMapOf<Char, Int>()

        for (char in licensePlate) {
            if (char.isLetter()) {
                val lowerChar = char.lowercaseChar()
                licenseFreq[lowerChar] = licenseFreq.getOrDefault(lowerChar, 0) + 1
            }
        }

        var result: String? = null

        wordsIteration@ for (word in words) {
            val wordFreq = mutableMapOf<Char, Int>()

            for (char in word) {
                val lowerChar = char.lowercaseChar()
                wordFreq[lowerChar] = wordFreq.getOrDefault(lowerChar, 0) + 1
            }

            for ((char, count) in licenseFreq) {
                if (wordFreq.getOrDefault(char, 0) < count) {
                    continue@wordsIteration
                }
            }

            when {
                result == null -> result = word
                word.length < result.length -> result = word
            }
        }

        return result!!
    }
}
