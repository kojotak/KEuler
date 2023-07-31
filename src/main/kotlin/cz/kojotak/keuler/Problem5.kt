package cz.kojotak.keuler

fun smallestMultiple() : Long {
    return smallestEvenlyDivisible(20)
}

fun smallestEvenlyDivisible(maxConsecutive: Int) : Long {
    for(result in 1L .. Long.MAX_VALUE){
        for(divisor in 1L .. maxConsecutive){
            if(result % divisor != 0L){
                break
            }
            if(divisor == maxConsecutive.toLong()){
                return result
            }
        }
    }
    throw SolutionNotFoundException()
}