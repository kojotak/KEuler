package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import java.time.DayOfWeek
import java.time.LocalDate

class Problem19 : EulerProblem {
    override fun solve(): Long {
        var date = LocalDate.of(1901, 1, 1)
        val end = LocalDate.of(2000, 12, 31)
        var counter = 0L
        while (date.isBefore(end)) {
            if (date.dayOfWeek == DayOfWeek.SUNDAY) counter++
            date = date.plusMonths(1)
        }
        return counter
    }
}
