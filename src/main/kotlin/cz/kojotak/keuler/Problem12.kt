package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem

class Problem12 : EulerProblem {

    override fun solve() = firstTriangleNumberWithMoreThanDivisors(500)

    val triangleNumbers = sequence<Long> {
        var number = Pair(1, 1L)

        while (true) {
            yield(number.second)
            number = Pair(number.first + 1, number.first + number.second + 1)
        }
    }

    fun factors(number: Long) = 1.rangeTo(number).filter { number % it == 0L }.toList()

    fun firstTriangleNumberWithMoreThanDivisors(divisors: Int) = triangleNumbers.filter {
        factors(it).size >= divisors
    }.take(1).first()
}
