import xyz.fartem.leetcodekotlin.easy.RangeAdditionII
import kotlin.test.Test
import kotlin.test.assertEquals

class RangeAdditionIITest {
    private val solution = RangeAdditionII()

    @Test
    fun testDefaultOne() {
        assertEquals(
            4,
            solution.maxCount(
                3,
                3,
                arrayOf(
                    intArrayOf(2, 2),
                    intArrayOf(3, 3)
                )
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            4,
            solution.maxCount(
                3,
                3,
                arrayOf(
                    intArrayOf(2, 2),
                    intArrayOf(3, 3),
                    intArrayOf(3, 3),
                    intArrayOf(3, 3),
                    intArrayOf(2, 2),
                    intArrayOf(3, 3),
                    intArrayOf(3, 3),
                    intArrayOf(3, 3),
                    intArrayOf(2, 2),
                    intArrayOf(3, 3),
                    intArrayOf(3, 3),
                    intArrayOf(3, 3)
                )
            )
        )
    }

    @Test
    fun testDefaultThree() {
        assertEquals(
            9,
            solution.maxCount(
                3,
                3,
                emptyArray(),
            )
        )
    }
}
