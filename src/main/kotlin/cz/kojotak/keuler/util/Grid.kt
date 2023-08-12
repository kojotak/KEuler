package cz.kojotak.keuler.util

class Grid(val data: Array<Array<Int>>) {

    fun largestProductInLeftDiagonal(size: Int): Long {
        val rows = data.size
        val cols = data[0].size
        var largestInColumn = -1L
        for (c in size until cols) {
            for (r in 0 until rows - size + 1) {
                var product = 1L
                for (i in 0 until size) {
                    product *= data[c - i][r + i]
                }
                if (product > largestInColumn) {
                    largestInColumn = product
                }
            }
        }
        return largestInColumn
    }

    fun largestProductInRightDiagonal(size: Int): Long {
        val rows = data.size
        val cols = data[0].size
        var largestInColumn = -1L
        for (c in 0 until cols - size + 1) {
            for (r in 0 until rows - size + 1) {
                var product = 1L
                for (i in 0 until size) {
                    product *= data[c + i][r + i]
                }
                if (product > largestInColumn) {
                    largestInColumn = product
                }
            }
        }
        return largestInColumn
    }

    fun largestProductInColumns(size: Int): Long {
        val rows = data.size
        val cols = data[0].size
        var largestInColumn = -1L
        for (c in 0 until cols) {
            for (r in 0 until rows - size + 1) {
                var product = 1L
                for (i in 0 until size) {
                    product *= data[c][r + i]
                }
                if (product > largestInColumn) {
                    largestInColumn = product
                }
            }
        }
        return largestInColumn
    }

    fun largestProductInRow(size: Int): Long {
        val rows = data.size
        val cols = data[0].size
        var largestInRow = -1L
        for (r in 0 until rows) {
            for (c in 0 until cols - size + 1) {
                var product = 1L
                for (i in 0 until size) {
                    product *= data[c + i][r]
                }
                if (product > largestInRow) {
                    largestInRow = product
                }
            }
        }
        return largestInRow
    }
}

val LINE_SEPARATOR = "\\n".toRegex()
val COLUMN_SEPARATOR = "\\s".toRegex()

fun readGrid(data: String): Grid {
    val lines = data.split(LINE_SEPARATOR)
    val cols = lines[0].split(COLUMN_SEPARATOR)
    val grid = Array(lines.size) {
        Array(cols.size) { 0 }
    }
    for (line in lines.indices) {
        val columns = lines[line].split(COLUMN_SEPARATOR)
        for (col in columns.indices) {
            grid[line][col] = columns[col].toInt()
        }
    }
    return Grid(grid)
}
