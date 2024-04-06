package com.example.problemssolving.problems.leetcode.easy

class TwoSum {

    fun execute(nums: IntArray, target: Int): IntArray {
        val complements = mutableMapOf<Int, Int>() // key -> num - value ->index

        for (index in nums.indices) {

            // find if a complement for the current num exist
            val complementIndex = complements[nums[index]]
            complementIndex?.let {
                return intArrayOf(index, complementIndex)
            }

            // if not calculate it and add it to the map
            complements[target - nums[index]] = index
        }
        throw IllegalArgumentException()
    }
}