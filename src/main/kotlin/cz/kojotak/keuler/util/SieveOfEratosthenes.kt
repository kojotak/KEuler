package cz.kojotak.keuler.util

import cz.kojotak.keuler.isqrt

class SieveOfEratosthenes(size: Int) {
    private val sieve: Array<Boolean> = Array(size) { true }

    init {
        for (index in 2..isqrt(sieve.size)) {
            if (sieve[index]) {
                for (j in index * index until sieve.size step index) {
                    sieve[j] = false
                }
            }
        }
    }

    fun nthPrimeNumber(nthOrder: Int) = primes().drop(nthOrder - 1).first()

    fun primes() = 2.rangeUntil(sieve.size).filter { sieve[it] }.map { it.toLong() }
}