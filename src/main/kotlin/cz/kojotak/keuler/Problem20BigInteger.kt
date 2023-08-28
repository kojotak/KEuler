package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import cz.kojotak.keuler.util.bigDecimalToDigitArray
import java.math.BigInteger

const val PROBLEM_20_INPUT = 100
class Problem20BigInteger : EulerProblem {

    override fun solve() = factorialDigitSum(PROBLEM_20_INPUT)

    fun factorialDigitSum(number: Int): Long = bigDecimalToDigitArray(factorial(number)).sum().toLong()

    fun factorial(number: Int): BigInteger = (1..number).fold(BigInteger.ONE) {
            acc, i ->
        acc.multiply(BigInteger.valueOf(i.toLong()))
    }
}
