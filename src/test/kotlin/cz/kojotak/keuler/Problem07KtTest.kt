package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Problem07KtTest{

    @Test
    fun primeNumberInSieveOfEratosthenes6th(){
        assertEquals(13, nthPrimeNumberInSieveOfEratosthenes(6))
    }
}