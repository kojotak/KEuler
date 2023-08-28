package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import cz.kojotak.keuler.util.bigDecimalToDigitArray
import cz.kojotak.keuler.util.factorial

const val PROBLEM_20_INPUT = 100
class Problem20 : EulerProblem {

    override fun solve() = factorialDigitSum(PROBLEM_20_INPUT)

    fun factorialDigitSum(number: Int): Long = bigDecimalToDigitArray(factorial(number)).sum().toLong()
}
