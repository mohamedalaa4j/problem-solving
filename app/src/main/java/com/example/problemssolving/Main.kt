package com.example.problemssolving

import com.example.problemssolving.problems.udemy.arrays.IsOneArrayARotationOfAnother


fun main() {
    val arrayA = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val arrayB = intArrayOf(7, 1, 2, 3, 4, 5, 6)

    println(
        IsOneArrayARotationOfAnother().isRotation(arrayA, arrayB)
    )
}