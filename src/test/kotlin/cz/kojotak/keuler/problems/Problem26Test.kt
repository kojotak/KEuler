package cz.kojotak.keuler.problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertContentEquals
class Problem26Test {

    @Test
    fun testFirst10() {
        assertEquals(7, Problem26().denominatorWithLongestRecurringCycle(10))
    }

    @Test
    fun testSolution() {
        assertEquals(-1, Problem26().denominatorWithLongestRecurringCycle(1000))
    }

    @ParameterizedTest
    @MethodSource("testRecurringCycleExamples")
    fun testRecurringCycles(denominator: Int, expectedRecurringCycle: List<Int>) {
        assertContentEquals(
            expectedRecurringCycle.toIntArray(),
            Problem26().recurringCycle(denominator).toIntArray()
        )
    }

    companion object {
        @JvmStatic
        fun testRecurringCycleExamples() = listOf(
            Arguments.of(2, emptyList<Int>()),
            Arguments.of(3, listOf(3)),
            Arguments.of(4, emptyList<Int>()),
            Arguments.of(5, emptyList<Int>()),
            Arguments.of(6, listOf(6)),
            Arguments.of(7, listOf(1, 4, 2, 8, 5, 7)),
            Arguments.of(8, emptyList<Int>()),
            Arguments.of(9, listOf(1)),
            Arguments.of(10, emptyList<Int>())
        )
    }
}
