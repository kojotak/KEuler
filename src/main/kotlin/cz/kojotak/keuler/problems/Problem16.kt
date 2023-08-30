package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem

class Problem16 : EulerProblem {
    override fun solve() = powerDigitSum(1000)

    fun powerDigitSum(exponent: Int): Long {
        val digits = mutableListOf(1)
        for (multiplier in 0 until exponent) {
            var overflowed = false
            for (index in digits.indices) {
                val newValue = digits[index] * 2 + booleanToInt(overflowed)
                digits[index] = newValue % 10
                overflowed = newValue >= 10
            }
            if (overflowed) {
                digits.add(1)
            }
        }
        return digits.sum().toLong()
    }

    private fun booleanToInt(boolean: Boolean) = if (boolean) 1 else 0
}
