package cz.kojotak.keuler

import cz.kojotak.keuler.problems.Problem01
import cz.kojotak.keuler.problems.Problem02
import cz.kojotak.keuler.problems.Problem03
import cz.kojotak.keuler.problems.Problem04
import cz.kojotak.keuler.problems.Problem05
import cz.kojotak.keuler.problems.Problem06
import cz.kojotak.keuler.problems.Problem07
import cz.kojotak.keuler.problems.Problem08
import cz.kojotak.keuler.problems.Problem09
import cz.kojotak.keuler.problems.Problem10
import cz.kojotak.keuler.problems.Problem11
import cz.kojotak.keuler.problems.Problem12
import cz.kojotak.keuler.problems.Problem13
import cz.kojotak.keuler.problems.Problem14
import cz.kojotak.keuler.problems.Problem16
import cz.kojotak.keuler.problems.Problem17
import cz.kojotak.keuler.problems.Problem18
import cz.kojotak.keuler.problems.Problem20
import cz.kojotak.keuler.problems.Problem67
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.assertTimeoutPreemptively
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import java.time.Duration
import java.time.temporal.ChronoUnit

class SolutionsIT {

    @ParameterizedTest
    @MethodSource
    fun checkSolution(problem: Class<EulerProblem>, expectedSolution: Long) {
        assertTimeoutPreemptively(Duration.of(10, ChronoUnit.SECONDS)) {
            val actualSolution = problem.getDeclaredConstructor().newInstance().solve()
            Assertions.assertEquals(expectedSolution, actualSolution)
        }
    }

    companion object {
        @JvmStatic
        fun checkSolution() = listOf(
            of(Problem01::class.java, 233168),
            of(Problem02::class.java, 4613732),
            of(Problem03::class.java, 6857),
            of(Problem04::class.java, 906609),
            of(Problem05::class.java, 232792560),
            of(Problem06::class.java, 25164150),
            of(Problem07::class.java, 104743),
            of(Problem08::class.java, 23514624000),
            of(Problem09::class.java, 31875000),
            of(Problem10::class.java, 142913828922),
            of(Problem11::class.java, 70600674),
            of(Problem12::class.java, 76576500),
            of(Problem13::class.java, 5537376230),
            of(Problem14::class.java, 837799),
            of(Problem16::class.java, 1366),
            of(Problem17::class.java, 21124),
            of(Problem18::class.java, 1074),
            of(Problem20::class.java, 648),
            of(Problem67::class.java, 7273),
        )
    }
}
