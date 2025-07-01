package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumDeletionsForAtMostKDistinctCharactersTest {
    private val solution = MinimumDeletionsForAtMostKDistinctCharacters()

    @Test
    fun testDefaultOne() {
        assertEquals(
            1,
            solution.minDeletion(
                "abc",
                2
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            0,
            solution.minDeletion(
                "aabb",
                2
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            2,
            solution.minDeletion(
                "yyyzz",
                1
            )
        )
    }
}
