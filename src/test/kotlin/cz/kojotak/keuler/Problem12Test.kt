package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals

class Problem12Test {

    @Test
    fun highlyDivisibleTriangularNumber() {
        assertEquals(28, Problem12().firstTriangleNumberWithMoreThanDivisors(5))
    }

    @Test
    fun firstTenTriangleNumbers() {
        val list = Problem12().triangleNumbers.take(10).toList()
        assertContentEquals(listOf(1, 3, 6, 10, 15, 21, 28, 36, 45, 55), list)
    }

    @ParameterizedTest
    @MethodSource("factorsArguments")
    fun factors(input: Long, expectedFactors: List<Long>) {
        assertContentEquals(expectedFactors, Problem12().factors(input))
    }

    companion object {
        @JvmStatic
        fun factorsArguments() = listOf(
            Arguments.of(1, listOf<Long>(1)),
            Arguments.of(3, listOf<Long>(1, 3)),
            Arguments.of(6, listOf<Long>(1, 2, 3, 6)),
            Arguments.of(10, listOf<Long>(1, 2, 5, 10)),
            Arguments.of(15, listOf<Long>(1, 3, 5, 15)),
            Arguments.of(21, listOf<Long>(1, 3, 7, 21)),
            Arguments.of(28, listOf<Long>(1, 2, 4, 7, 14, 28))
        )
    }
}
