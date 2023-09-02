package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import cz.kojotak.keuler.sumOfDivisorsForNumbers

class Problem21 : EulerProblem {

    override fun solve(): Long {
        val sumOfDivisors = sumOfDivisorsForNumbers(10_000)

        return sumOfDivisors
            .filterIndexed { a, b -> a != b && b < sumOfDivisors.size && a == sumOfDivisors[b] }
            .sum().toLong()
    }
}
