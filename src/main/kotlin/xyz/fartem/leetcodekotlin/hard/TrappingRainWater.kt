package xyz.fartem.leetcodekotlin.hard

class TrappingRainWater {
    fun trap(height: IntArray): Int {
        var left = 0
        var leftMax = 0

        var right = height.size - 1
        var rightMax = 0

        var result = 0

        while (left <= right) {
            val atLeft = height[left]
            val atRight = height[right]

            if (atLeft <= atRight) {
                if (atLeft > leftMax) {
                    leftMax = atLeft
                } else {
                    result += leftMax - atLeft
                }

                left++
            } else {
                if (atRight > rightMax) {
                    rightMax = atRight
                } else {
                    result += rightMax - atRight
                }

                right--
            }
        }

        return result
    }
}
