package cz.kojotak.keuler.problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals
class Problem25Test {

    @Test
    fun firstFibonacciNumberToContainThreeDigits() {
        assertEquals(12, Problem25().indexOfFibonacciNumberContainingDigits(3))
    }

    @ParameterizedTest
    @MethodSource("fibonaccihoNumbersExamples")
    fun fibonaccihoNumbersAsIntArrays(index: Int, expectedListOfNumbers: List<Int>) {
        assertContentEquals(
            expectedListOfNumbers.toIntArray(),
            Problem25().fibonacciNumberAsIntArray().elementAt(index).second
        )
    }
    companion object {
        @JvmStatic
        fun fibonaccihoNumbersExamples() = listOf(
            Arguments.of(1, listOf(1)),
            Arguments.of(2, listOf(1)),
            Arguments.of(3, listOf(2)),
            Arguments.of(4, listOf(3)),
            Arguments.of(5, listOf(5)),
            Arguments.of(6, listOf(8)),
            Arguments.of(7, listOf(1, 3)),
            Arguments.of(8, listOf(2, 1)),
            Arguments.of(9, listOf(3, 4)),
            Arguments.of(10, listOf(5, 5)),
            Arguments.of(11, listOf(8, 9)),
            Arguments.of(12, listOf(1, 4, 4)),
        )
    }
}
