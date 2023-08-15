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

    fun factorsSize(number: Long) = 1.rangeTo(lsqrt(number))
        .filter { number % it == 0L }
        .map { if (number / it == it) 1 else 2 } // 9=3*3, but but 8=4*2
        .sum()

    fun firstTriangleNumberWithMoreThanDivisors(divisors: Int) = triangleNumbers.filter {
        factorsSize(it) >= divisors
    }.take(1).first()
}
