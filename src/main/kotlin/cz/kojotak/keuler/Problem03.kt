package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import cz.kojotak.keuler.util.primeFactors
import kotlin.math.sqrt

class Problem03 : EulerProblem {
    override fun solve()= largestPrimeFactor(600851475143)
}
fun distinctPrimeFactors(number: Long) : List<Long> = primeFactors(number).distinct()
fun largestPrimeFactor(number: Long) : Long = distinctPrimeFactors(number).maxOf { it }

fun lsqrt(number : Long) : Long = sqrt(number.toDouble()).toLong()
fun isqrt(number : Int) : Int = sqrt(number.toDouble()).toInt()