package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import cz.kojotak.keuler.SolutionNotFoundException

class Problem09 : EulerProblem {
    override fun solve(): Long {
        for (a in 1L..(1000 - 1 - 2 - 3)) {
            for (b in (a + 1)..(1000 - 1 - a)) {
                val summedSquares = a * a + b * b
                val c = 1000 - a - b
                val squaredC = c * c
                if (summedSquares == squaredC) {
                    return a * b * c
                }
            }
        }
        throw SolutionNotFoundException()
    }
}
