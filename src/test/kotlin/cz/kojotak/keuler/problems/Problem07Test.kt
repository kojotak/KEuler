package cz.kojotak.keuler.problems

import cz.kojotak.keuler.util.SieveOfEratosthenes
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Problem07Test {

    @Test
    fun primeNumberInSieveOfEratosthenes6th() {
        assertEquals(13, SieveOfEratosthenes(1_000).nthPrimeNumber(6))
    }
}
