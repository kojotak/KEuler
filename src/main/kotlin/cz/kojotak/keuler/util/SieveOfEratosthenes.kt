package cz.kojotak.keuler.util

import cz.kojotak.keuler.spi.SolutionNotFoundException
import cz.kojotak.keuler.isqrt

class SieveOfEratosthenes(size: Int) {
    private val sieve : Array<Boolean> = Array(size) { true }

    init {
        for (index in 2 ..isqrt(sieve.size)){
            if(sieve[index]){
                for( j in index*index until sieve.size step index){
                    sieve[j] = false
                }
            }
        }
    }

    fun nthPrimeNumber(nthOrder: Int) : Long{
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

    fun primes(): List<Long>{
        val result = mutableListOf<Long>()
        for(index in 2 until sieve.size){
            if(sieve[index]){
                result.add(index.toLong())
            }
        }
        return result
    }
}