package cz.kojotak.keuler

class Problem07 : EulerProblem {
    override fun solve() = nthPrimeNumberInSieveOfEratosthenes(10001)
}

const val MAX_PRIME_NUMBER = 1_000_000
fun nthPrimeNumberInSieveOfEratosthenes(nthOrder: Int): Long {
    val sieve = Array(MAX_PRIME_NUMBER) { true }
    for (index in 2 .. isqrt(sieve.size)){
        if(sieve[index]){
            for( j in index*index until sieve.size step index){
                sieve[j] = false
            }
        }
    }
    var count = 0
    for(index in 2 until sieve.size){
        if(sieve[index]){
            if(++count == nthOrder){
                return index.toLong()
            }
        }
    }
    throw SolutionNotFoundException("$nthOrder.th prime number not found in a sieve of Eratosthenes of size ${sieve.size}")
}
