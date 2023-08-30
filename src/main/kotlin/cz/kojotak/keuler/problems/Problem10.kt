package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import cz.kojotak.keuler.util.SieveOfEratosthenes

class Problem10 : EulerProblem {
    override fun solve() = SieveOfEratosthenes(2_000_000).primes().sum()
}
