package cz.kojotak.keuler

import cz.kojotak.keuler.util.primeFactors
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class Problem05Test {

    @Test
    fun smallestMultipleEvenlyDivisible10() {
        assertEquals(2520, Problem05().smallestEvenlyDivisible(10))
    }

    @ParameterizedTest
    @MethodSource("primeFactorsExamples")
    fun testPrimeFactors(expectedPrimeFactors: List<Long>, numberToFactorize: Long) {
        assertIterableEquals(expectedPrimeFactors, primeFactors(numberToFactorize))
    }
    companion object {
        @JvmStatic
        fun primeFactorsExamples() = listOf(
            Arguments.of(listOf<Long>(2, 2, 3, 5), 60),
            Arguments.of(listOf<Long>(2, 2, 2, 2), 16),
            Arguments.of(listOf<Long>(17), 17)
        )
    }
}
