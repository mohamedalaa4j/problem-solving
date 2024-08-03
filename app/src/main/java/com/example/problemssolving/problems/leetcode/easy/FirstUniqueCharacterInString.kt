package com.example.problemssolving.problems.leetcode.easy

class FirstUniqueCharacterInString {
    fun firstUniqueChar(s: String): Int {
        if (s.isEmpty()) return -1

        val hashtable = mutableMapOf<Char, Int>()

        // add char or increase the value if exist
        for (char in s) {
            if (hashtable[char] != null) {
                hashtable[char] = hashtable[char]!! + 1
            } else {
                hashtable[char] = 1
            }
        }

        // find the non-repeating char
        for (i in hashtable) {
            if (i.value == 1) {
                return s.indexOf(i.key)
            }
        }

        return -1
    }
}