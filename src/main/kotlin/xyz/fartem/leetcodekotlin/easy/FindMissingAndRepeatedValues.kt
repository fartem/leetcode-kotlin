package xyz.fartem.leetcodekotlin.easy

class FindMissingAndRepeatedValues {
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
        val flatGrid = mutableMapOf<Int, Int>()
        var max = 0
        var duplicate = -1

        grid.forEach { part ->
            part.forEach { num ->
                max = maxOf(max, num)

                val count = flatGrid.getOrDefault(num, 0) + 1
                flatGrid.put(num, count)

                if (count > 1) {
                    duplicate = num
                }
            }
        }

        var missed = -1

        for (i in 1 until max) {
            if (!flatGrid.containsKey(i)) {
                missed = i
            }
        }

        return intArrayOf(
            duplicate,
            if (missed == -1) max + 1 else missed
        )
    }
}
