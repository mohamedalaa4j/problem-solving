package com.example.problemssolving

import com.example.problemssolving.problems.udemy.arrays.IsOneArrayARotationOfAnother
import com.example.problemssolving.problems.udemy.arrays.MostFrequentlyOccurringItem


fun main() {
    val arrayA = intArrayOf(0, -1, 10, 10, -1, 10, -1, -1, -1, 1)

    println(
        MostFrequentlyOccurringItem().mostFrequent(arrayA.toList())
    )
}