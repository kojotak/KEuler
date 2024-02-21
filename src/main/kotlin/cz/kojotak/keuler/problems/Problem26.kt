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
        if(number>=100){
            numerator *= 10
        }
        val reminders = mutableListOf<Int>()
        do {
            val divisor = numerator / number
            val reminder = numerator % number
            if (reminder == 0) {
                return emptyList()
            }
            reminders.add(divisor)
            val recurringCycle = recurringCycle(reminders)
            if (recurringCycle != null) {
                return recurringCycle
            }
            numerator = reminder * 10
        } while (true)
    }

    private fun recurringCycle(list: List<Int>): List<Int>? {
        if (list.size <= 1) {
            //not enough length to recur
            return null
        }
        val half = list.size / 2
        for (length in 1..half) {
            val reversed = list.reversed()
            val one = reversed.subList(0, length)
            val two = reversed.subList(length, length * 2)
            if(one.equals(two)){
                return one.reversed()
            }
        }
        return null
    }
}
