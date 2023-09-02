package cz.kojotak.keuler.problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Problem23Test {

    private val problem23 = Problem23()

    @Test
    fun smallestAbundantNumber() {
        assertEquals(12, problem23.listOfAbundantNumbers(1000).first())
    }

    @Test
    fun smallestNumberAsSumOfTwoAbundantNumbers() {
        val abundantNumbers = problem23.listOfAbundantNumbers(1000)
        assertTrue(problem23.isSumOfTwoAbundantNumbers(24, abundantNumbers))
    }
}
