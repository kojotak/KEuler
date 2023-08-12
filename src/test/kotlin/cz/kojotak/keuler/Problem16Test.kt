package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class Problem16Test {

    @ParameterizedTest
    @MethodSource("powerDigitSumArguments")
    fun powerDigitSumTest(expectedSum: Long, exponent: Int) {
        assertEquals(expectedSum, Problem16().powerDigitSum(exponent))
    }

    companion object {
        @JvmStatic
        fun powerDigitSumArguments() = listOf(
            Arguments.of(2, 1),
            Arguments.of(4, 2),
            Arguments.of(8, 3),
            Arguments.of(1 + 6, 4),
            Arguments.of(3 + 2, 5),
            Arguments.of(6 + 4, 6),
            Arguments.of(1 + 2 + 8, 7),
            Arguments.of(2 + 5 + 6, 8),
            Arguments.of(5 + 1 + 2, 9),
            Arguments.of(1 + 0 + 2 + 4, 10),
            Arguments.of(2 + 0 + 4 + 8, 11),
            Arguments.of(4 + 0 + 9 + 6, 12),
            Arguments.of(8 + 1 + 9 + 2, 13),
            Arguments.of(1 + 6 + 3 + 8 + 4, 14),
            Arguments.of(3 + 2 + 7 + 6 + 8, 15),
        )
    }
}
