package com.example.problemssolving.problems.udemy.arrays

/*
Is One Array a Rotation of Another?
Write a function that returns true if one array is a rotation of another.

NOTE: There are no duplicates in each of these arrays.

Example: [1, 2, 3, 4, 5, 6, 7] is a rotation of [4, 5, 6, 7, 1, 2, 3].
*/

class IsOneArrayARotationOfAnother {
    fun isRotation(arrayA: IntArray, arrayB: IntArray): Boolean {
        val indexA = 0
        var indexB = -1

        // check arrays size
        if (arrayA.size != arrayB.size) {
            return false
        }

        // find the equivalent in arrayB
        for (i in arrayB.indices) {
            if (arrayB[i] == arrayA[indexA]) {
                indexB = i
                break
            }
        }

        // if no equivalent exit
        if (indexB == -1) {
            println("index not exist")
            return false
        }

        // compare indexes
        for (i in arrayA.indices) {
            val indexBEquivalent = (indexB + i) % arrayA.size
            if (arrayA[i] != arrayB[indexBEquivalent]) {
                return false
            }
        }

        return true
    }
}