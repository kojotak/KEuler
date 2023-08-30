package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import cz.kojotak.keuler.util.SieveOfEratosthenes

class Problem07 : EulerProblem {
    override fun solve() = SieveOfEratosthenes(1_000_000).nthPrimeNumber(10001)
}
