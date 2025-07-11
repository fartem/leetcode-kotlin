package xyz.fartem.leetcodekotlin.medium

import java.util.*

class DistantBarcodes {
    fun rearrangeBarcodes(barcodes: IntArray): IntArray {
        val frequencyMap = mutableMapOf<Int, Int>()

        for (code in barcodes) {
            frequencyMap[code] = frequencyMap.getOrDefault(code, 0) + 1
        }

        val maxHeap = PriorityQueue<Int>(compareByDescending { frequencyMap[it] })
        maxHeap.addAll(frequencyMap.keys)

        val result = IntArray(barcodes.size)
        var index = 0

        while (maxHeap.isNotEmpty()) {
            val current = maxHeap.poll()
            val next = if (maxHeap.isNotEmpty()) maxHeap.poll() else null

            result[index++] = current
            frequencyMap[current] = frequencyMap[current]!! - 1

            if (frequencyMap[current]!! > 0) {
                maxHeap.offer(current)
            }

            if (next != null) {
                result[index++] = next
                frequencyMap[next] = frequencyMap[next]!! - 1

                if (frequencyMap[next]!! > 0) {
                    maxHeap.offer(next)
                }
            }
        }

        return result
    }
}
