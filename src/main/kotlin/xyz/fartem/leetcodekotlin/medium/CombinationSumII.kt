package xyz.fartem.leetcodekotlin.medium

class CombinationSumII {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        candidates.sort()

        val n = candidates.size
        val suffixSum = IntArray(n + 1).apply {
            this[n] = 0
            for (i in n - 1 downTo 0) {
                this[i] = candidates[i] + this[i + 1]
            }
        }

        fun backtrack(start: Int, current: MutableList<Int>, remaining: Int) {
            when {
                remaining == 0 -> result.add(ArrayList(current))
                remaining < 0 -> return
                remaining > suffixSum[start] -> return
                else -> {
                    for (i in start until candidates.size) {
                        when {
                            i > start && candidates[i] == candidates[i - 1] -> continue
                            candidates[i] > remaining -> break
                            else -> {
                                current.add(candidates[i])
                                backtrack(i + 1, current, remaining - candidates[i])
                                current.removeLast()
                            }
                        }
                    }
                }
            }
        }

        backtrack(0, mutableListOf(), target)

        return result
    }
}
