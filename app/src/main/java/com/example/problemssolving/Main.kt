package com.example.problemssolving

import com.example.problemssolving.problems.udemy.arrays.CommonElementsInTwoSortedArrays
import com.example.problemssolving.problems.udemy.arrays.IsOneArrayARotationOfAnother
import com.example.problemssolving.problems.udemy.arrays.MostFrequentlyOccurringItem


fun main() {
    val arrayA = intArrayOf(0, 1, 2, 3, 4, 5)
    val arrayB = intArrayOf(6, 7, 8, 9, 10, 11)

    println(
        CommonElementsInTwoSortedArrays().commonElements(arrayA,arrayB)
    )
}