package cz.kojotak.keuler

class SolutionNotFoundException(message: String?) : RuntimeException(message){
    constructor(): this("")
}