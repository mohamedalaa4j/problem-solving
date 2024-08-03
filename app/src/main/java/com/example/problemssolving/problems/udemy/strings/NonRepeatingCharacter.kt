package com.example.problemssolving.problems.udemy.strings

/*
Non-Repeating Character (Java)
Implement a function that takes a string and returns the first character that does not appear twice or more.

Example:

"abacc" -> 'b' ('a' appears twice, and so does 'c')
"xxyzx" -> 'y' ('y' and 'z' are non-repeating characters, and 'y' appears first)
If there is no non-repeating character, return null.
 */

class NonRepeatingCharacter {
    fun nonRepeating(input: String): Char? {
        val hashtable = mutableMapOf<Char, Int>()

        // add char or increase the value if exist
        for (char in input) {
            if (hashtable[char] != null) {
                hashtable[char] = hashtable[char]!! + 1
            } else {
                hashtable[char] = 1
            }
        }

        // find the non-repeating char
        for (i in hashtable) {
            if (i.value == 1) {
                return i.key
            }
        }

        return null
    }
}