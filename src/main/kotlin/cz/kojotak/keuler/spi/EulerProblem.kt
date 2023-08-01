package cz.kojotak.keuler.spi

interface EulerProblem {

    @Throws(SolutionNotFoundException::class)
    fun solve(): Long
}

class SolutionNotFoundException(message: String?) : RuntimeException(message){
    constructor(): this("")
}