package com.example.problemssolving.problems.leetcode.easy

class ValidParentheses {
    fun validParentheses(input: String): Boolean {
//        var output = false
        val x = input.length
        val y = input.length % 2
        if (input.length % 2 == 0) {
            for (i in input.indices step 2) {
                when (input[i]) {
                    '(' -> {
                        if (input[i + 1] != ')') {
                            return false
                        }
                    }

                    '[' -> {
                        if (input[i + 1] != ']') {
                            return false
                        }
                    }

                    '{' -> {
                        if (input[i + 1] != '}') {
                            return false
                        }
                    }

//                    else -> output = false
                }
            }
        }
        return true
    }
}