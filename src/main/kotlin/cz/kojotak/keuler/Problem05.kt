package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import kotlin.math.max

class Problem05 : EulerProblem {
    override fun solve() = smallestEvenlyDivisible(20)

}
fun smallestEvenlyDivisible(maxConsecutive: Int) : Long {
    val factors = mutableMapOf<Long, Int>()
    for(divisor in 1L .. maxConsecutive){
        val f = primeFactorsAsMap(divisor)
        f.forEach{ (factor, count) ->
            run {
                val current = factors.getOrDefault(factor, 0)
                factors[factor] = max(current, count)
            }
        }
    }
    var result = 1L
    for(entry in factors){
        for(x in 1 .. entry.value){
            result *= entry.key
        }
    }
    return result
}

fun primeFactorsAsMap(number: Long): Map<Long,Int> {
    val result = mutableMapOf<Long,Int>()
    for(factor in primeFactors(number)){
        val count = result.getOrDefault(factor, 0)
        result[factor] = count+1
    }
    return result
}

fun primeFactors(number: Long) : List<Long> {
    var intermediate = number
    val primeFactors = mutableListOf<Long>()

    //optimization: separate while cycle for 2 can allow us to "step 2" in next for cycle
    while(intermediate % 2 == 0L){
        primeFactors.add(2)
        intermediate /= 2
    }
    for(divisor in 3 .. intermediate step 2){
        while(intermediate % divisor == 0L){
            primeFactors.add(divisor)
            intermediate /= divisor
        }
    }
    return primeFactors
}