package com.example.problemssolving.problems.leetcode.easy

class RomanToInteger {
    fun execute(string: String): Int {
        var value = 0
        val map = hashMapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,

            'L' to 50,
            'C' to 100,

            'D' to 500,
            'M' to 1000
        )

        var i = 0
        while (i < string.length) {
            val current = map[string[i]]
            if (i == string.length - 1) {
                value += current!!
                break
            }
            val next = map[string[i + 1]]
            if (current!! < next!!) {
                value += next - current
                i++
            } else {
                value += current
            }
            i++
        }
        return value
    }
}