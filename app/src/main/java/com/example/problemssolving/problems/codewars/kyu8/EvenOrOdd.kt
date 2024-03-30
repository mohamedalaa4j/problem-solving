package com.example.problemssolving.problems.codewars.kyu8

/*
Create a function that takes an integer as an argument
and returns "Even" for even numbers or "Odd" for odd numbers.
 */

class EvenOrOdd {
    fun evenOrOdd(number: Int): String {
        return if (number % 2 == 0) "Even" else "Odd"
    }
}