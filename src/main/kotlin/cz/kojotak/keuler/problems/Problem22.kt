package cz.kojotak.keuler.problems

import cz.kojotak.keuler.EulerProblem

class Problem22 : EulerProblem {
    override fun solve() = loadSortedNames().mapIndexed { index, name -> wordValue(name) * (index + 1) }.sum()

    fun loadSortedNames(): List<String> {
        val text = this.javaClass.classLoader.getResource("0022_names.txt")?.readText() ?: error(
            "Can not read data for problem 22"
        )
        return text
            .split(",")
            .map { it.replace("\"".toRegex(), "") }
            .sorted()
    }

    fun wordValue(word: String) = word.map { ch -> ch.minus('A') + 1 }.sum().toLong()
}
