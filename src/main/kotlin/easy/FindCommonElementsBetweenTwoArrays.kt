package easy

class FindCommonElementsBetweenTwoArrays {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val set2 = nums2.toSet()
        val answer1 = nums1.count { it in set2 }

        val set1 = nums1.toSet()
        val answer2 = nums2.count { it in set1 }

        return intArrayOf(answer1, answer2)
    }
}
