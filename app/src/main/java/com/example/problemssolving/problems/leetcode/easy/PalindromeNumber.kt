package com.example.problemssolving.problems.leetcode.easy

class PalindromeNumber {

    fun isPalindromeNumber(number: Int): Boolean {
        val input = number.toString()
        var reversedInput = ""

        for (i in input.length - 1 downTo 0) {
            reversedInput += input[i]
        }
        return  input == reversedInput
    }

    fun isPalindromeNumber2(number: Int):Boolean{
        return  number.toString() == number.toString().reversed()
    }
}