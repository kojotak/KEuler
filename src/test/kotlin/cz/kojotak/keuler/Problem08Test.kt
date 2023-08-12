package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Problem08Test {

    @Test
    fun largestProductInSeriesOfFour() {
        assertEquals(5832, Problem08().maxProductOfAdjacentDigits(4))
    }
}
