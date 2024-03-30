package com.example.problemssolving.problems.kyu8

/*
Description:
Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

Examples
replace("Hi!") === "H!!"
replace("!Hi! Hi!") === "!H!! H!!"
replace("aeiou") === "!!!!!"
replace("ABCDE") === "!BCD!"
 */

class ReplaceVowelToExclamationMark {

    // mySolution
    fun myReplace(input: String): String {
        var output = ""
        for (i in input) {
            if (i in "aeiouAEIOU") {
                output += "!"
            } else {
                output += i
            }
        }
        return output
    }

    // regex solution
    fun replace(s: String) = s.replace(Regex("[aeiouAEIOU]"), "!")

    // kotlin collections solution
    fun replace2(s: String): String {
        var answer: String = ""
        s.forEach {
            answer += if (it in "aeiouAEIOU") '!' else it
        }
        return answer
    }

    // kotlin collections solution
    fun replace3(s: String) = s.map { if (it in "aeiouAEIOU") '!' else it }.joinToString("")
}