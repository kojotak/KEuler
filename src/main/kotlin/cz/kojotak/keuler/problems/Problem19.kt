package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import java.time.DayOfWeek
import java.time.LocalDate
import java.util.stream.Stream

class Problem19 : EulerProblem {
    override fun solve(): Long {
        val date = LocalDate.of(1901, 1, 1)
        val end = LocalDate.of(2000, 12, 31)

        return Stream.iterate(
            date,
            { it.isBefore(end) },
            { it.plusMonths(1) }
        )
            .filter { it.dayOfWeek == DayOfWeek.SUNDAY }
            .count()
    }
}
