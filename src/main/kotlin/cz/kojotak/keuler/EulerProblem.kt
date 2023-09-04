package cz.kojotak.keuler

interface EulerProblem {

    @Throws(SolutionNotFoundException::class)
    fun solve(): Long
}

class SolutionNotFoundException(message: String?) : RuntimeException(message) {
    constructor() : this("")
}

const val MAX_DECIMAL_NUMBER = 10
