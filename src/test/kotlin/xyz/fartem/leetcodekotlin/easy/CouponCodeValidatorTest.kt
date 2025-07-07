package xyz.fartem.leetcodekotlin.easy

import kotlin.test.Test
import kotlin.test.assertContentEquals

class CouponCodeValidatorTest {
    private val solution = CouponCodeValidator()

    @Test
    fun testDefaultOne() {
        assertContentEquals(
            listOf("PHARMA5", "SAVE20"),
            solution.validateCoupons(
                arrayOf("SAVE20", "", "PHARMA5", "SAVE@20"),
                arrayOf("restaurant", "grocery", "pharmacy", "restaurant"),
                booleanArrayOf(true, true, true, true)
            )
        )
    }

    @Test
    fun testDefaultTwo() {
        assertContentEquals(
            listOf("ELECTRONICS_50"),
            solution.validateCoupons(
                arrayOf("GROCERY15", "ELECTRONICS_50", "DISCOUNT10"),
                arrayOf("grocery", "electronics", "invalid"),
                booleanArrayOf(false, true, true)
            )
        )
    }
}
