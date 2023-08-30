package cz.kojotak.keuler.problems

import cz.kojotak.keuler.util.SieveOfEratosthenes
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Problem10Test {

    @Test
    fun summationOfPrimesBellow10() {
        assertEquals(17, SieveOfEratosthenes(10).primes().sum())
    }
}
