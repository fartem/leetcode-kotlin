package easy

import kotlin.test.Test
import kotlin.test.assertEquals

class MinimumAverageOfSmallestAndLargestElementsTest {
    private val solution = MinimumAverageOfSmallestAndLargestElements()

    @Test
    fun testDefaultOne() {
        assertEquals(
            5.5,
            solution.minimumAverage(
                intArrayOf(7, 8, 3, 4, 15, 13, 4, 1)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            5.5,
            solution.minimumAverage(
                intArrayOf(1, 9, 8, 3, 10, 5)
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            5.0,
            solution.minimumAverage(
                intArrayOf(1, 2, 3, 7, 8, 9)
            )
        )
    }
}
