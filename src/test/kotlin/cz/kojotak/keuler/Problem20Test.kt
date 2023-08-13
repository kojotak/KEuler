package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigInteger

class Problem20Test {

    @Test
    fun factorialOf10() {
        assertEquals(BigInteger.valueOf(3628800L), Problem20BigInteger().factorial(10))
    }

    @Test
    fun factorialDigitSumOf10() {
        assertEquals(3 + 6 + 2 + 8 + 8 + 0 + 0, Problem20BigInteger().factorialDigitSum(10))
    }
}
