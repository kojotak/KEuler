package cz.kojotak.keuler

import cz.kojotak.keuler.util.SieveOfEratosthenes
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Problem10Test {

    @Test
    fun summationOfPrimesBellow10() {
        assertEquals(17, SieveOfEratosthenes(10).primes().sum())
    }
}
