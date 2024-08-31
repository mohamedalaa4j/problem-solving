package com.example.problemssolving.problems.udemy.twodimentionalarray

const val BOMB = -1

class AssignNumberMinesweeper {
    fun run(rows: Int, columns: Int, bombsList: List<List<Int>>) {
        val grid = mutableListOf<MutableList<Int>>()

        // generate grid
        for (i in 1..rows) {
            val row = generateRow(columns)
            grid.add(row)
        }

        for (bomb in bombsList) {
            // assign bombs
            val rowIndex = bomb[0]
            val columnIndex = bomb[1]
            grid[rowIndex][columnIndex] = BOMB

            // fill surround bombs cells
            for (i in rowIndex - 1..rowIndex + 1) {
                for (j in columnIndex - 1..columnIndex + 1) {

                    if (i in 0..<rows &&
                        j in 0..<columns &&
                        grid[i][j] != BOMB
                    ) {
                        grid[i][j] += 1
                    }
                }
            }
        }
        grid.forEach { row -> println(row) }
    }

    private fun generateRow(rowSize: Int): MutableList<Int> {
        val row = mutableListOf<Int>()
        for (i in 1..rowSize) {
            row.add(0)
        }
        return row
    }
}