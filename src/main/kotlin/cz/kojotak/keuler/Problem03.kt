package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import cz.kojotak.keuler.util.distinctPrimeFactors
import kotlin.math.sqrt

class Problem03 : EulerProblem {
    override fun solve() = largestPrimeFactor(600851475143)
}

fun largestPrimeFactor(number: Long) = distinctPrimeFactors(number).last()

fun lsqrt(number : Long) = sqrt(number.toDouble()).toLong()
fun isqrt(number : Int) = sqrt(number.toDouble()).toInt()