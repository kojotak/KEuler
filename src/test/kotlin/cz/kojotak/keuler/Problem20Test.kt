package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Problem20Test {

    @Test
    fun factorialDigitSumOf10() {
        assertEquals(3 + 6 + 2 + 8 + 8 + 0 + 0, Problem20().factorialDigitSum(10))
    }
}
