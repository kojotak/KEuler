package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import cz.kojotak.keuler.sumOfDivisorsForNumbers

class Problem23 : EulerProblem {

    private val limit = 28123
    override fun solve(): Long {
        val abundantNumbers = listOfAbundantNumbers(limit)
        return (1L..limit)
            .filter { isSumOfTwoAbundantNumbers(it.toInt(), abundantNumbers).not() }
            .sum()
    }

    fun isSumOfTwoAbundantNumbers(number: Int, abundantNumbers: List<Int>): Boolean {
        for (firstCandidate in abundantNumbers.reversed()) {
            if (firstCandidate < number) {
                for (secondCandidate in abundantNumbers) {
                    val sum = firstCandidate + secondCandidate
                    when {
                        sum == number -> return true
                        sum > number -> break
                    }
                }
            }
        }
        return false
    }

    fun listOfAbundantNumbers(limit: Int) = sumOfDivisorsForNumbers(limit)
        .mapIndexed { index, value -> index to value }
        .filter { (key, value) -> value > key }
        .map { it.first }
}
