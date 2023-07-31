package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Problem5KtTest{

    @Test
    fun smallestMultipleEvenlyDivisible10(){
        assertEquals(2520, smallestEvenlyDivisible(10))
    }
}