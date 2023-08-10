package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import java.lang.IllegalArgumentException

class Problem17 : EulerProblem {
    override fun solve() = sumLettersOfNumbersTo(1000)

    fun sumLettersOfNumbersTo(number: Int) = 1.rangeTo(number).sumOf { numberOfLetters(it) }.toLong()

    fun numberOfLetters(number: Int) = numberOfLetters(numberToNumeral(number))

    fun numberToNumeral(number: Int) = when {
        number < 10 -> digitToNumeral(number)
        number < 20 -> teenToNumeral(number)
        number < 100 -> tensToNumeral(number)
        number < 1000 -> hundredsToNumeral(number)
        number < 10000 -> thousandsToNumeral(number)
        else -> throw IllegalArgumentException("number is too big to convert it to numeral")
    }

    private fun numberOfLetters(string: String) = string.filter { it.isLetter() }.length

    private fun thousandsToNumeral(number: Int) : String {
        val thousands = number / 1000
        val remainder = number % 1000
        return digitToNumeral(thousands) + " thousand" + if(remainder>0) " and " + numberToNumeral(remainder) else ""
    }
    private fun hundredsToNumeral(number: Int) : String {
        val hundreds = number / 100
        val remainder = number % 100
        return digitToNumeral(hundreds) + " hundred" + if(remainder>0) " and " + numberToNumeral(remainder) else ""
    }

    private fun tensToNumeral(number: Int) : String {
        val tens = number / 10
        val remainder = number % 10
        return tensDigitToNumeral(tens) + if(remainder > 0) "-" + numberToNumeral(remainder) else ""
    }

    private fun tensDigitToNumeral(digit: Int) = when(digit) {
        0 -> ""
        1 -> "ten"
        2 -> "twenty"
        3 -> "thirty"
        4 -> "forty"
        5 -> "fifty"
        6 -> "sixty"
        7 -> "seventy"
        8 -> "eighty"
        9 -> "ninety"
        else -> throw IllegalArgumentException("invalid $digit for tensDigitToNumeral")
    }

    private fun teenToNumeral(number: Int) = when(number){
        10 -> "ten"
        11 -> "eleven"
        12 -> "twelve"
        13 -> "thirteen"
        14 -> "fourteen"
        15 -> "fifteen"
        16 -> "sixteen"
        17 -> "seventeen"
        18 -> "eighteen"
        19 -> "nineteen"
        else -> throw IllegalArgumentException("invalid $number for teenToNumeral")
    }

    private fun digitToNumeral(digit: Int) = when(digit){
        0 -> ""
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        6 -> "six"
        7 -> "seven"
        8 -> "eight"
        9 -> "nine"
        else -> throw IllegalArgumentException("invalid $digit for digitToNumeral")
    }
}