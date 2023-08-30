package cz.kojotak.keuler.problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Problem08Test {

    @Test
    fun largestProductInSeriesOfFour() {
        assertEquals(5832, Problem08().maxProductOfAdjacentDigits(4))
    }
}
