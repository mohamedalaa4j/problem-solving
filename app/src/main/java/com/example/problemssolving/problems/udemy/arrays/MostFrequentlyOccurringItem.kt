package com.example.problemssolving.problems.udemy.arrays

/*
Most Frequently Occurring Item in an Array (Python)
Find the most frequently occurring item in an array.

Example: The most frequently occurring item in [1, 3, 1, 3, 2, 1] is 1.

If you're given an empty array, you should return null (in Java) or None (in Python).

You can assume that there is always a single, unique value that appears most frequently unless the array is empty.  For instance, you won't be given an array such as [1, 1, 2, 2].

NOTE: We're going to use lists instead of arrays in Python for simplicity.
 */
class MostFrequentlyOccurringItem {
    fun mostFrequent(list: List<Int>): Int? {
        val hashtable = mutableMapOf<Int, Int>()
        var maxKey: Int? = null
        var maxValue = 0

        // add item or increase the value if exist
        for (i in list) {
            if (hashtable[i] != null) {
                hashtable[i] = hashtable[i]!! + 1
            } else {
                hashtable[i] = 1
            }
        }

        // find the most frequent key
        for ((key, value) in hashtable) {
            if (value > maxValue) {
                maxValue = value
                maxKey = key
            }
        }

        return maxKey
    }
}