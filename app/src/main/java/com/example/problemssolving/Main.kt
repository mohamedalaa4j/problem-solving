package com.example.problemssolving

import com.example.problemssolving.problems.udemy.strings.OneEditAwayStrings


fun main() {
    val tests: MutableList<Pair<String, String>> = mutableListOf()
    tests.add(Pair("abcde", "abcd"))
    tests.add(Pair("abde", "abcde"))
    tests.add(Pair("a", "a"))
    tests.add(Pair("abcdef", "abqdef"))
    tests.add(Pair("abcdef", "abccef"))
    tests.add(Pair("abcdef", "abcde"))
    tests.add(Pair("aaa", "abc"))
    tests.add(Pair("abcde", "abc"))
    tests.add(Pair("abc", "abcde"))
    tests.add(Pair("abc", "bcc"))

    for (i in tests) {
        println(
            OneEditAwayStrings().isOneEditAway(i.first, i.second)
        )
    }

}