package xyz.fartem.leetcodekotlin.medium

import kotlin.test.Test
import kotlin.test.assertEquals

class CountDaysWithoutMeetingsTest {
    private val solution = CountDaysWithoutMeetings()

    @Test
    fun testDefaultOne() {
        assertEquals(
            2,
            solution.countDays(
                10,
                arrayOf(
                    intArrayOf(5, 7),
                    intArrayOf(1, 3),
                    intArrayOf(9, 10)
                )
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            1,
            solution.countDays(
                5,
                arrayOf(
                    intArrayOf(2, 4),
                    intArrayOf(1, 3)
                )
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            0,
            solution.countDays(
                6,
                arrayOf(
                    intArrayOf(1, 6)
                )
            )
        )
    }
}
