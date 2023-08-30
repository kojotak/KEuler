package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem

class Problem14 : EulerProblem {
    override fun solve(): Long {
        val collatzSequenceLengths = LongArray(1_000_000) { 0 }
        var max = -1
        var maxIndex = -1
        for (i in collatzSequenceLengths.indices.reversed()) {
            if (collatzSequenceLengths[i] > 0) {
                continue
            }
            val seq = collatzSequence(i.toLong())
            collatzSequenceLengths[i] = seq.size.toLong()
            for ((index, value) in seq.withIndex()) {
                // remember intermediate results to speed up other lookups
                if (value < collatzSequenceLengths.size) {
                    collatzSequenceLengths[value.toInt()] = seq.size.toLong() - index
                }
                collatzSequenceLengths[i] = seq.size.toLong()
            }
            if (collatzSequenceLengths[i] > max) {
                max = seq.size
                maxIndex = i
            }
        }
        return maxIndex.toLong()
    }

    fun collatzSequence(number: Long): List<Long> {
        val sequence = mutableListOf<Long>()
        var n = number
        sequence.add(n)
        while (n > 1) {
            n = next(n)
            sequence.add(n)
        }
        return sequence
    }

    private fun next(n: Long) = when (n % 2) {
        0L -> n / 2
        else -> 3 * n + 1
    }
}
