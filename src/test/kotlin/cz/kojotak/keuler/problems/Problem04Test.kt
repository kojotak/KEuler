package cz.kojotak.keuler.problems

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class Problem04Test {

    @Test
    fun panamaPalindrome() {
        val string = "A man, a plan, a canal – Panama"
        val input = Regex("[^a-z]").replace(string.lowercase(), "")
        assertTrue(Problem04().isPalindrome(input))
    }

    @Test
    fun abbaIsPalindrome() {
        assertTrue(Problem04().isPalindrome("ABBA"))
    }

    @Test
    fun number9009IsPalindrome() {
        assertTrue(Problem04().isPalindrome(9009))
    }
}
