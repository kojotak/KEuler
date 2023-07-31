package cz.kojotak.keuler

fun largestPalindromeProduct() : Long {
    var largestPalindrome = -1L
    for(i in 999L downTo 100L){
        for(j in 999L downTo 100L){
            val product  = i * j
            if(isPalindrome(product) && product > largestPalindrome){
                largestPalindrome = product
            }
        }
    }
    return largestPalindrome
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