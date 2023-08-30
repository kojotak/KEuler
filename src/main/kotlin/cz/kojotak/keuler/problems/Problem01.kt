package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import java.util.stream.LongStream

class Problem01 : EulerProblem {
    override fun solve() = LongStream.range(1, 1000).filter { it % 3 == 0L || it % 5 == 0L }.sum()
}
