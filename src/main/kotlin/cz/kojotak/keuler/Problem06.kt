package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem

class Problem06 : EulerProblem {
    override fun solve() = sumSquareDifference(100)
}

fun sumSquareDifference(size: Int): Long {
    var sumOfSquares = 0L
    var sum = 0
    for (i in 1..size) {
        sum += i
        sumOfSquares += (i * i)
    }
    return (sum * sum) - sumOfSquares
}
