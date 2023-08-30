package cz.kojotak.keuler.problems

class Problem67 : Problem18() {

    override fun solve() = maximumPathSum(
        this.javaClass.classLoader.getResource("0067_triangle.txt")?.readText() ?: error(
            "Can not read data for problem 67"
        )
    )
}
