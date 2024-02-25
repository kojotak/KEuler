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
        assertEquals(983, Problem26().denominatorWithLongestRecurringCycle(1000))
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
            Arguments.of(10, emptyList<Int>()),

            //https://en.wikipedia.org/wiki/Repeating_decimal
            Arguments.of(17, listOf(0,5,8,8,2,3,5,2,9,4,1,1,7,6,4,7)),
            Arguments.of(19, listOf(0,5,2,6,3,1,5,7,8,9,4,7,3,6,8,4,2,1)),
            Arguments.of(21, listOf(0,4,7,6,1,9)),
            Arguments.of(23, listOf(0,4,3,4,7,8,2,6,0,8,6,9,5,6,5,2,1,7,3,9,1,3)),
            Arguments.of(29, listOf(0,3,4,4,8,2,7,5,8,6,2,0,6,8,9,6,5,5,1,7,2,4,1,3,7,9,3,1)),
            Arguments.of(31, listOf(0,3,2,2,5,8,0,6,4,5,1,6,1,2,9)),
            Arguments.of(47, listOf(0,2,1,2,7,6,5,9,5,7,4,4,6,8,0,8,5,1,0,6,3,8,2,9,7,8,7,2,3,4,0,4,2,5,5,3,1,9,1,4,8,9,3,6,1,7))

            )
    }
}
