package com.example.problemssolving.problems.udemy.strings

class OneEditAwayStrings {
    fun isOneEditAway(stringA: String, stringB: String): Boolean {
        when {
            stringA.length == stringB.length -> {
                var editCount = 0
                for (i in stringA.indices) {
                    if (stringA[i] != stringB[i]) editCount += 1
                    if (editCount > 1) return false
                }
            }

            // if A smaller by 1
            stringA.length + 1 == stringB.length -> {
                isOneEditAwayDiffLength(stringA,stringB)
            }

            // if B smaller by 1
            stringB.length + 1 == stringA.length -> {
                isOneEditAwayDiffLength(stringB,stringA)
            }

            // if one bigger by more than 1
            else -> return false

        }
        return true
    }

    private fun isOneEditAwayDiffLength(smallString:String, longerString: String):Boolean{
        var editCount = 0
        var i = 0
        while (i <= smallString.length - 1) {
            if (smallString[i] == longerString[i + editCount]) {
                i += 1
            } else {
                i += 1
                editCount += 1
                if (editCount > 1) return false
            }
        }
        return true
    }
}