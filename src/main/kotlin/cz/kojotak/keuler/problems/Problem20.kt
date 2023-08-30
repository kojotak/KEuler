package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import cz.kojotak.keuler.bigDecimalToDigitArray
import cz.kojotak.keuler.factorial

class Problem20 : EulerProblem {

    override fun solve() = factorialDigitSum(100)

    fun factorialDigitSum(number: Int): Long = bigDecimalToDigitArray(factorial(number)).sum().toLong()
}
