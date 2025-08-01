package xyz.fartem.leetcodekotlin.easy

class OrderedStream(private val n: Int) {
    private val stream = arrayOfNulls<String>(n + 1)
    private var pointer = 1

    fun insert(idKey: Int, value: String): List<String> {
        stream[idKey] = value

        val result = mutableListOf<String>()
        while (pointer <= n && stream[pointer] != null) {
            result.add(stream[pointer]!!)

            pointer++
        }

        return result
    }
}
