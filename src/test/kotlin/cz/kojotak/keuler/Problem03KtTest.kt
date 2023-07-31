package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class Problem03KtTest {

    @Test
    fun primeFactorOf13195(){
        assertEquals( listOf(5L,7L,13L,29L), distinctPrimeFactors(13195))
    }

    @Test
    fun largestPrimeFactorOf13195(){
        assertEquals( 29L, largestPrimeFactor(13195))
    }

    @ParameterizedTest
    @MethodSource("lsqrtSources")
    fun lsqrt(input: Long, expectedLsqrt: Long) {
        assertEquals(expectedLsqrt, lsqrt(input))
    }

    companion object{
        @JvmStatic
        fun lsqrtSources() = listOf(
            Arguments.of(4, 2),
            Arguments.of(5, 2),
            Arguments.of(6, 2),
            Arguments.of(7, 2),
            Arguments.of(8, 2),
            Arguments.of(9, 3),
        )
    }
}