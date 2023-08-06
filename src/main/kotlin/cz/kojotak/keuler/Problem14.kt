package cz.kojotak.keuler

import cz.kojotak.keuler.spi.EulerProblem

class Problem14 : EulerProblem {
    override fun solve(): Long {
        val collatzSequenceLengths = LongArray(1_000_000)
        var max=-1
        var maxIndex=-1
        for(i in collatzSequenceLengths.indices){
            val seq = collatzSequence(i.toLong())
            collatzSequenceLengths[i] = seq.size.toLong()
            if(seq.size>max){
                max = seq.size
                maxIndex = i
            }
        }
        return maxIndex.toLong()
    }

    fun collatzSequence(number: Long) : List<Long>{
        val sequence = mutableListOf<Long>()
        var n = number
        sequence.add(n)
        while(n>1) {
            if(n % 2 == 0L){
                n /= 2
            } else {
                n = 3*n + 1
            }
            sequence.add(n)
        }
        return sequence
    }
}