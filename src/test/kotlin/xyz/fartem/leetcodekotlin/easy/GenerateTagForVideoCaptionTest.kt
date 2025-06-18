package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertEquals

class GenerateTagForVideoCaptionTest {
    private val solution = GenerateTagForVideoCaption()

    @Test
    fun testDefaultOne() {
        assertEquals(
            "#leetcodeDailyStreakAchieved",
            solution.generateTag(
                "Leetcode daily streak achieved"
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            "#canIGoThere",
            solution.generateTag(
                "can I Go There"
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            "#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh",
            solution.generateTag(
                "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"
            )
        )
    }
}
