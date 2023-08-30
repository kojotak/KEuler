package cz.kojotak.keuler.problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Problem18Test {

    private val trainingData = """
        3
        7 4
        2 4 6
        8 5 9 3
    """.trimIndent()

    @Test
    fun maximumSumPathOfTrainingData() {
        assertEquals(23, Problem18().maximumPathSum(trainingData))
    }
}
