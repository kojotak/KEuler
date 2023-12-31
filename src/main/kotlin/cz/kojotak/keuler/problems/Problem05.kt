package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import cz.kojotak.keuler.primeFactorsAsMap
import kotlin.math.max

class Problem05 : EulerProblem {
    override fun solve() = smallestEvenlyDivisible(20)

    fun smallestEvenlyDivisible(maxConsecutive: Int): Long {
        val factors = mutableMapOf<Long, Int>()
        for (divisor in 1L..maxConsecutive) {
            primeFactorsAsMap(divisor).forEach { (factor, count) ->
                run {
                    val current = factors.getOrDefault(factor, 0)
                    factors[factor] = max(current, count)
                }
            }
        }
        var result = 1L
        for (entry in factors) {
            for (x in 1..entry.value) {
                result *= entry.key
            }
        }
        return result
    }
}
