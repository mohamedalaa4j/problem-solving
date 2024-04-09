package com.example.problemssolving.problems.leetcode.easy

import java.util.Stack

class ValidParentheses {

    // no nesting
    fun validParentheses1(input: String): Boolean {
        var output = false
        var i = 0

        while (i < input.length) {
            when (input[i]) {
                '(' -> if (input[i + 1] == ')') {
                    output = true
                    i++
                } else {
                    output = false
                    break
                }
                '{' -> if (input[i + 1] == '}') {
                    output = true
                    i++
                } else {
                    output = false
                    break
                }
                '[' -> if (input[i + 1] == ']') {
                    output = true
                    i++
                } else {
                    output = false
                    break
                }
            }
            i++
        }

        return output
    }

    fun validParentheses(input: String): Boolean{
        if (input.length % 2 != 0) return false

        val stack = Stack<Char>()

        for (i in input){
            if (i == '(' || i == '{' || i == '['){
                stack.push(i)
            }else if (i == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop()
            }else if (i == '}'  && !stack.empty() && stack.peek() == '{'){
                stack.pop()
            }else if (i == ']'  && !stack.empty() && stack.peek() == '['){
                stack.pop()
            }else{
                // "([}}])"
                return false
            }
        }
        return stack.isEmpty()
    }
}