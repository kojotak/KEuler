package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem

class Problem21 : EulerProblem {

    override fun solve(): Long {
        val sumOfDivisors = sumOfDivisors(10_000)

        return sumOfDivisors
            .filterIndexed { a, b -> a != b && b < sumOfDivisors.size && a == sumOfDivisors[b] }
            .sum().toLong()
    }

    fun sumOfDivisors(limit: Int): IntArray {
        val sumOfDivisors = IntArray(limit + 1)
        for (number in 0..limit) {
            for (divisor in 1 until number) {
                if (number % divisor == 0) {
                    sumOfDivisors[number] += divisor
                }
            }
        }
        return sumOfDivisors
    }
}
