package xyz.fartem.leetcodekotlin.easy

class AppleRedistributionIntoBoxes {
    fun minimumBoxes(apple: IntArray, capacity: IntArray): Int {
        var apples = apple.sum()
        var result = 0
        val boxes = capacity.sortedDescending()
        var boxPointer = 0

        while (apples > 0) {
            result += 1
            apples -= boxes[boxPointer++]
        }

        return result
    }
}
