package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertContentEquals

class BinaryWatchTest {
    private val solution = BinaryWatch()

    @Test
    fun testDefaultOne() {
        assertContentEquals(
            listOf("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"),
            solution.readBinaryWatch(1)
        )
    }

    @Test
    fun testDefaultTwo() {
        assertContentEquals(
            emptyList(),
            solution.readBinaryWatch(9)
        )
    }
}
