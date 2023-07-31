package cz.kojotak.keuler

fun evenFibonacciNumbers() : Int {
    var sum = 0
    var previous = 0
    var current = 1
    while(current < 4_000_000){
        val next = previous + current
        previous = current
        current = next
        if(next % 2 == 0){
            sum += next
        }
    }
    return sum
}