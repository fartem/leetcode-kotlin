package xyz.fartem.leetcodekotlin.easy

class BinaryWatch {
    fun readBinaryWatch(turnedOn: Int): List<String> {
        val result = mutableListOf<String>()

        for (h in 0..11) {
            for (m in 0..59) {
                val hours = Integer.bitCount(h)
                val minutes = Integer.bitCount(m)

                if (hours + minutes == turnedOn) {
                    result.add(String.format("%d:%02d", h, m))
                }
            }
        }

        return result
    }
}
