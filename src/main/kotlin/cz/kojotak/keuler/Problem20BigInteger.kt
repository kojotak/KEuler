package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import cz.kojotak.keuler.util.bigDecimalToDigitArray
import java.math.BigInteger

const val PROBLEM_20_INPUT = 100
class Problem20BigInteger : EulerProblem {

    override fun solve() = factorialDigitSum(PROBLEM_20_INPUT)

    fun factorialDigitSum(number: Int): Long = bigDecimalToDigitArray(factorial(number)).sum().toLong()

    fun factorial(number: Int): BigInteger {
        var result = BigInteger.ONE
        for (multiplier in 1L..number) {
            result *= BigInteger.valueOf(multiplier)
        }
        return result
    }
}
