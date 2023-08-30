package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import cz.kojotak.keuler.largestPrimeFactor

class Problem03 : EulerProblem {
    override fun solve() = largestPrimeFactor(600851475143)
}
