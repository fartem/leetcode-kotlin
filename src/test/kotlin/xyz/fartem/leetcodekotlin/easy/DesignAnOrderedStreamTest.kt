package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertContentEquals

class DesignAnOrderedStreamTest {
    @Test
    fun testDefaultOne() {
        val orderedStream = OrderedStream(5)

        assertContentEquals(
            emptyList(),
            orderedStream.insert(3, "ccccc")
        )

        assertContentEquals(
            listOf("aaaaa"),
            orderedStream.insert(1, "aaaaa")
        )

        assertContentEquals(
            listOf("bbbbb", "ccccc"),
            orderedStream.insert(2, "bbbbb")
        )

        assertContentEquals(
            emptyList(),
            orderedStream.insert(5, "eeeee")
        )

        assertContentEquals(
            listOf("ddddd", "eeeee"),
            orderedStream.insert(4, "ddddd")
        )
    }
}
