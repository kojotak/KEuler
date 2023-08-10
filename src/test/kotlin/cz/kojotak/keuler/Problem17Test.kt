package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class Problem17Test{

    @Test
    fun sumNumberLettersTo5(){
        assertEquals(19, Problem17().sumLettersOfNumbersTo(5))
    }

    @ParameterizedTest
    @MethodSource("numberLetterCountArguments")
    fun numberLetterCounts(expectedLength: Int, number: Int) {
        assertEquals(expectedLength, Problem17().numberOfLetters(number))
    }

    @ParameterizedTest
    @MethodSource("numberToNumeralArguments")
    fun numberToNumeral(expectedNumeral: String, number: Int) {
        assertEquals(expectedNumeral, Problem17().numberToNumeral(number))
    }

    companion object{
        @JvmStatic
        fun numberLetterCountArguments() = listOf(
            Arguments.of(3, 1),
            Arguments.of(3, 2),
            Arguments.of(5, 3),
            Arguments.of(4, 4),
            Arguments.of(4, 5),
            Arguments.of(23, 342),
            Arguments.of(20, 115)
        )

        @JvmStatic
        fun numberToNumeralArguments() = listOf(
            Arguments.of("one", 1),
            Arguments.of("two", 2),
            Arguments.of("three", 3),
            Arguments.of("three hundred and forty-two", 342),
            Arguments.of("one hundred and fifteen", 115),
            Arguments.of("one hundred", 100),
            Arguments.of("one hundred and one", 101),
            Arguments.of("one thousand", 1000)
        )
    }
}