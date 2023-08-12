package cz.kojotak.keuler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Problem04Test {

    @Test
    fun panamaPalindrome() {
        val string = "A man, a plan, a canal – Panama"
        val input = Regex("[^a-z]").replace(string.lowercase(), "")
        assertTrue(isPalindrome(input))
    }

    @Test
    fun abbaIsPalindrome() {
        assertTrue(isPalindrome("ABBA"))
    }

    @Test
    fun number9009IsPalindrome() {
        assertTrue(isPalindrome(9009))
    }
}
