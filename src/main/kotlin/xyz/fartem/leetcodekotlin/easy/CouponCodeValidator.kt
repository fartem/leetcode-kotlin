package xyz.fartem.leetcodekotlin.easy

class CouponCodeValidator {

    companion object {
        val validCategories = listOf(
            "electronics",
            "grocery",
            "pharmacy",
            "restaurant",
        )

        val regex = "^[a-zA-Z0-9_]+$".toRegex()
    }

    fun validateCoupons(
        code: Array<String>,
        businessLine: Array<String>,
        isActive: BooleanArray,
    ): List<String> {
        val validCoupons = mutableListOf<Pair<String, String>>()

        code.forEachIndexed { i, c ->
            val line = businessLine[i]

            when {
                !isActive[i] -> return@forEachIndexed
                !validCategories.contains(line) -> return@forEachIndexed
                c.matches(regex) -> validCoupons.add(line to c)
            }
        }

        val sortedCoupons = validCoupons.sortedWith(
            compareBy(
                { (business, _) -> validCategories.indexOf(business) },
                { (_, code) -> code }
            )
        )

        return sortedCoupons.map { it.second }
    }
}
