package cz.kojotak.keuler

import kotlin.math.sqrt

fun largestPrimeFactor() : Long = largestPrimeFactor(600851475143)

fun largestPrimeFactor(number: Long) : Long = distinctPrimeFactors(number).last()

fun distinctPrimeFactors(number : Long) : List<Long> {
    val result = mutableSetOf<Long>()
    var intermediate = number
    for(divisor in 2 .. lsqrt(number)){
        if(intermediate % divisor == 0L){
            intermediate /= divisor
            result.add(divisor)
        }
    }
    return result.sorted()
}

fun lsqrt(number : Long) : Long = sqrt(number.toDouble()).toLong()
fun isqrt(number : Int) : Int = sqrt(number.toDouble()).toInt()