package cz.kojotak.keuler.util

val LINE_SEPARATOR = "\\n".toRegex()
val COLUMN_SEPARATOR = "\\s".toRegex()

fun readGrid(data: String) : Array<Array<Int>> {
    val lines = data.split(LINE_SEPARATOR)
    val cols = lines[0].split(COLUMN_SEPARATOR)
    val grid = Array(lines.size){
        Array(cols.size){0}
    }
    for( line in lines.indices){
        val columns = lines[line].split(COLUMN_SEPARATOR)
        for( col in columns.indices){
            grid[line][col] = columns[col].toInt()
        }
    }
    return grid
}