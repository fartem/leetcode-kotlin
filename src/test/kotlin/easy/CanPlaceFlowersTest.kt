package easy

import org.junit.jupiter.api.Assertions.assertFalse
import kotlin.test.Test
import kotlin.test.assertTrue

class CanPlaceFlowersTest {
    private val solution = CanPlaceFlowers()

    @Test
    fun testDefaultOne() {
        assertTrue(
            solution.canPlaceFlowers(
                intArrayOf(1, 0, 0, 0, 1),
                1
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertFalse(
            solution.canPlaceFlowers(
                intArrayOf(1, 0, 0, 0, 1),
                2
            )
        )
    }
}
