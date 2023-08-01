package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Problem08KtTest{

    @Test
    fun largestProductInSeriesOfFour(){
        val problem08 = Problem08()
        assertEquals(5832, maxProductOfAdjacentDigits(4, problem08.number))
    }
}