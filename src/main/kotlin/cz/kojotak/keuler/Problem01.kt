package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import java.util.stream.LongStream

class Problem01 : EulerProblem {
    override fun solve() = LongStream.range(1, 1000).filter{  it % 3 == 0L || it % 5 == 0L}.sum()
}