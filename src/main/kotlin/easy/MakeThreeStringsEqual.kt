package easy

class MakeThreeStringsEqual {
    fun findMinimumOperations(s1: String, s2: String, s3: String): Int {
        val minLength = minOf(s1.length, s2.length, s3.length)
        var i = 0

        while (i < minLength) {
            if (s1[i] == s2[i] && s2[i] == s3[i]) {
                i++
            } else {
                break
            }
        }

        if (i == 0) {
            return -1
        }

        return (s1.length - i) + (s2.length - i) + (s3.length - i)
    }
}
