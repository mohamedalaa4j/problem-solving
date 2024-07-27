package com.example.problemssolving.problems.udemy.arrays

/*
Common Elements in Two Sorted Arrays (Python)
Write a function that returns the common elements (as an array) between two sorted arrays of integers (ascending order).

Example: The common elements between [1, 3, 4, 6, 7, 9] and [1, 2, 4, 5, 9, 10] are [1, 4, 9].

REMINDER: We're going to use lists instead of arrays in Python for simplicity.
 */
class CommonElementsInTwoSortedArrays {
    fun commonElements(arrayA: IntArray, arrayB: IntArray): String {
        val commonElementsArray = mutableListOf<Int>()
        var arrayAPointer = 0
        var arrayBPointer = 0

        while (arrayAPointer < arrayA.size && arrayBPointer < arrayB.size) {
            when {
                arrayA[arrayAPointer] == arrayB[arrayBPointer] -> {
                    commonElementsArray.add(arrayA[arrayAPointer])
                    arrayAPointer += 1
                    arrayBPointer += 1
                }

                arrayA[arrayAPointer] > arrayB[arrayBPointer] -> {
                    arrayBPointer += 1
                }

                arrayA[arrayAPointer] < arrayB[arrayBPointer] -> {
                    arrayAPointer += 1
                }
            }
        }

        return commonElementsArray.toString()
    }
}