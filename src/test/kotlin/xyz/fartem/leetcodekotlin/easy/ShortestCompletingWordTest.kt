package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class ShortestCompletingWordTest {
    private val solution = ShortestCompletingWord()

    @Test
    fun testDefaultOne() {
        assertEquals(
            "steps",
            solution.shortestCompletingWord(
                "1s3 PSt",
                arrayOf("step", "steps", "stripe", "stepple")
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            "pest",
            solution.shortestCompletingWord(
                "1s3 456",
                arrayOf("looks", "pest", "stew", "show")
            )
        )
    }
}
