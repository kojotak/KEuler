package cz.kojotak.keuler.problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Problem21Test {

    @Test
    fun sumOfDivisorsForNumbersFromProblemDescription() {
        val sums = Problem21().sumOfDivisors(284)
        assertEquals(284, sums[220])
        assertEquals(220, sums[284])
    }
}
