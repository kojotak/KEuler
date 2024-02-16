package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem
import cz.kojotak.keuler.MAX_DECIMAL_NUMBER
import kotlin.math.max

class Problem25 : EulerProblem {
    override fun solve() = indexOfFibonacciNumberContainingDigits(1000)

    fun indexOfFibonacciNumberContainingDigits(numberOfDigits: Int) =
        fibonacciNumberAsIntArray().indexOfFirst { it.second.size >= numberOfDigits }.toLong()

    fun fibonacciNumberAsIntArray(): Sequence<Pair<Long, IntArray>> = generateSequence(
        Triple(
            1L,
            IntArray(1) { _ -> 0 },
            IntArray(1) { _ -> 1 }
        )
    ) {
        Triple(it.first + 1, it.third, addFibonacciNumbersAsIntArrays(it.second, it.third))
    }.map { Pair(it.first, it.second.reversedArray()) }

    private fun addFibonacciNumbersAsIntArrays(first: IntArray, second: IntArray): IntArray {
        val length = max(first.size, second.size)
        var result = IntArray(length) { 0 }
        for (index in 0 until length) {
            if (index < first.size) {
                result[index] += first[index]
            }
            if (index < second.size) {
                result[index] += second[index]
            }
            if (result[index] >= MAX_DECIMAL_NUMBER) {
                result[index] -= MAX_DECIMAL_NUMBER
                if (index + 1 < result.size) {
                    result[index + 1] += 1
                } else {
                    // overflow
                    val newArray = IntArray(result.size + 1)
                    System.arraycopy(result, 0, newArray, 0, result.size)
                    newArray[result.size] += 1
                    result = newArray
                }
            }
        }
        return result
    }
}
