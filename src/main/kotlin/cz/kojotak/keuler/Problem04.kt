package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import cz.kojotak.keuler.spi.SolutionNotFoundException

class Problem04 : EulerProblem {
    override fun solve(): Long {
        var largestPalindrome = -1L
        for(i in 999L downTo 100L){
            for(j in 999L downTo 100L){
                val product  = i * j
                if(isPalindrome(product) && product > largestPalindrome){
                    largestPalindrome = product
                }
            }
        }
        return largestPalindrome.takeIf { it > 0 } ?: throw SolutionNotFoundException()
    }
}

fun isPalindrome(number: Number) : Boolean = isPalindrome(number.toString())

fun isPalindrome(string : String) : Boolean {
    for(i in 0..string.length/2){
        if(string[i] != string[string.length-i-1]){
            return false
        }
    }
    return true
}