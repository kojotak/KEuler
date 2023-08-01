package cz.kojotak.keuler

class Problem09 : EulerProblem {
    override fun solve(): Long {
        for(a in 1L.. (1000-1-2-3)){
            for(b in (a+1) ..  (1000-1-a)){
                val summedSquares = a*a + b*b
                val c = 1000 - a - b
                val squeredC = c*c
                if(summedSquares == squeredC){
                    return a * b * c
                }
            }
        }
        throw SolutionNotFoundException()
    }
}