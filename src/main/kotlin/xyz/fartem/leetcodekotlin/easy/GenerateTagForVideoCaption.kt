package xyz.fartem.leetcodekotlin.easy

import kotlin.math.min

class GenerateTagForVideoCaption {
    fun generateTag(caption: String): String {
        val result = StringBuilder("#")
        var nextUp = false

        for (i in 0 until caption.length) {
            val curr = caption[i]

            if (curr == ' ') {
                nextUp = true
            } else {
                result.append(if (nextUp && result.length > 1) curr.uppercaseChar() else curr.lowercaseChar())

                nextUp = false
            }
        }

        return result.substring(0, min(result.length, 100))
    }
}
