package com.example.problemssolving

import com.example.problemssolving.problems.udemy.twodimentionalarray.AssignNumberMinesweeper


fun main() {
    val bombsList = listOf(
        listOf(0, 0),
        listOf(0, 1)
    ) // 3 - 4

    val bombsList1 = listOf(
        listOf(0, 2),
        listOf(2, 0)
    ) // 3 - 4
    val bombsList2 = listOf(
        listOf(0, 0),
        listOf(0, 1),
        listOf(1, 2)
    ) // 3 - 4
     val bombsList3 = listOf(
        listOf(1, 1),
        listOf(1, 2),
        listOf(2, 2),
        listOf(4, 3)
    ) // 5 - 5

//    AssignNumberMinesweeper().run(3, 4, bombsList)
//    AssignNumberMinesweeper().run(3, 3, bombsList1)
//    AssignNumberMinesweeper().run(3, 4, bombsList2)
    AssignNumberMinesweeper().run(5, 5, bombsList3)

}