package cz.kojotak.keuler

class Problem02 : EulerProblem {
    override fun solve(): Long {
        var sum = 0L
        var previous = 0
        var current = 1
        while(current < 4_000_000){
            val next = previous + current
            previous = current
            current = next
            if(next % 2 == 0){
                sum += next
            }
        }
        return sum
    }

}