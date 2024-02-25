package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem

class Problem26 : EulerProblem {
    override fun solve() = denominatorWithLongestRecurringCycle(1000)

    fun denominatorWithLongestRecurringCycle(length: Int) : Long = (1..length)
        .associateWith { recurringCycle(it).size }
        .toList().maxByOrNull { (_, value) -> value }!!
        .first
        .toLong()

    fun recurringCycle(number: Int): List<Int> {
        var numerator = 10
        val divisors = mutableListOf<Int>()
        val reminders = mutableListOf<Int>()
        do {
            val divisor = numerator / number
            val reminder = numerator % number
            if (reminder == 0) {
                return emptyList()
            }
            divisors.add(divisor)
            reminders.add(reminder)
            val recurringCycle = recurringCycle(divisors, reminders)
            if (recurringCycle != null) {
                println("$number $recurringCycle")
                return recurringCycle
            }
            numerator = reminder * 10
        } while (true)
    }

    private fun recurringCycle(divisors: List<Int>, reminders: List<Int>): List<Int>? {
        if (divisors.size <= 1) {
            //not enough length to recur
            return null
        }
        val half = divisors.size / 2
        for (length in 1..half) {
            val reversedD = divisors.reversed()
            val reversedR = reminders.reversed()
            val firstD = reversedD.subList(0, length)
            val firstR = reversedR.subList(0, length)
            val secondD = reversedD.subList(length, length * 2)
            val secondR = reversedR.subList(length, length * 2)
            if(firstD.equals(secondD) && firstR.equals(secondR)){
                return firstD.reversed()
            }
        }
        return null
    }
}
