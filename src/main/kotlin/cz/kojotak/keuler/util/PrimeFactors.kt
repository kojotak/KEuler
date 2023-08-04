package cz.kojotak.keuler.util

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