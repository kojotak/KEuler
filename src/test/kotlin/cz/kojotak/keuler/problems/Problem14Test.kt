package cz.kojotak.keuler.problems

import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test

internal class Problem14Test {

    @Test
    fun collatzSequenceOf13() {
        assertIterableEquals(listOf<Long>(13, 40, 20, 10, 5, 16, 8, 4, 2, 1), Problem14().collatzSequence(13L))
    }
}
