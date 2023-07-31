package cz.kojotak.keuler

fun sumSquareDifference() : Long = sumSquareDifference(100)

fun sumSquareDifference(size: Int) : Long {
    var sumOfSquares = 0L
    var sum = 0
    for(i in 1 .. size){
        sum += i
        sumOfSquares += (i*i)
    }
    return (sum*sum) - sumOfSquares
}
