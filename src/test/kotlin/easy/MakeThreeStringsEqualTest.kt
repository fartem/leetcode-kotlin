package easy

import kotlin.test.Test
import kotlin.test.assertEquals

class MakeThreeStringsEqualTest {
    private val solution = MakeThreeStringsEqual()

    @Test
    fun testDefaultOne() {
        assertEquals(
            2,
            solution.findMinimumOperations(
                "abc", "abb", "ab"
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertEquals(
            2,
            solution.findMinimumOperations(
                "abc", "abb", "ab"
            )
        )
    }
}
