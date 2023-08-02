package cz.kojotak.keuler.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class InputReaderKtTest {

    @Test
    fun grid2x2() {
        val grid = readGrid("""
            01 02
            03 04
        """.trimIndent())

        assertEquals(2, grid.size)
        val row1 = grid[0]
        assertEquals( 2, row1.size)
        assertEquals(1, row1[0])
        assertEquals(2, row1[1])
        val row2 = grid[1]
        assertEquals(2, row2.size)
        assertEquals(3, row2[0])
        assertEquals(4, row2[1])
    }

    @Test
    fun grid1x3(){
        val grid = readGrid("01 02 03")
        assertEquals(1, grid.size)
        val row = grid[0]
        assertEquals( 3, row.size)
        assertEquals(1, row[0])
        assertEquals(2, row[1])
        assertEquals(3, row[2])
    }

    @Test
    fun grid3x1(){
        val grid = readGrid("01\n02\n03")
        assertEquals(3, grid.size)
        assertEquals(1, grid[0][0])
        assertEquals(2, grid[1][0])
        assertEquals(3, grid[2][0])
    }
}