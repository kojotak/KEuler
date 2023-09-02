package cz.kojotak.keuler.problems

import cz.kojotak.keuler.sumOfDivisorsForNumbers
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Problem21Test {

    @Test
    fun sumOfDivisorsForNumbersFromProblemDescription() {
        val sums = sumOfDivisorsForNumbers(284)
        assertEquals(284, sums[220])
        assertEquals(220, sums[284])
    }
}
