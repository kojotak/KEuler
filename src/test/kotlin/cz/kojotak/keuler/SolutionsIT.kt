package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

class SolutionsIT {

    @ParameterizedTest
    @MethodSource
    fun checkSolution(problem: Class<EulerProblem>, expectedSolution: Long) {
        val actualSolution = problem.getDeclaredConstructor().newInstance().solve()
        Assertions.assertEquals(expectedSolution, actualSolution)
    }

    companion object{
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
            of(Problem10::class.java, 142913828922)
        )
    }
}