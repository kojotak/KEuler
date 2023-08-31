package cz.kojotak.keuler.problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertTrue

class Problem22Test {

    val knownName = "COLIN"

    @Test
    fun wordValueOfColin() {
        assertEquals(53, Problem22().wordValue(knownName))
    }

    @Test
    fun loadAlphabeticalSortedNames() {
        val names = Problem22().loadSortedNames()
        assertTrue(names.isNotEmpty())
        assertContains(names, knownName)

        // lists are indexed from 0, not from 1 as in problem's example
        assertEquals(938, names.indexOf(knownName) + 1)
    }
}
