package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import java.time.DayOfWeek
import java.time.LocalDate

class Problem19 : EulerProblem {

    private val startDate = LocalDate.of(1901, 1, 1)
    private val endDate = LocalDate.of(2000, 12, 31)

    private val days = sequence<LocalDate> {
        var date = startDate

        while (date.isBefore(endDate)) {
            yield(date)
            date = date.plusMonths(1)
        }
    }

    override fun solve() = days
        .filter { it.dayOfWeek == DayOfWeek.SUNDAY }
        .count().toLong()
}
