package com.caminha.leetcode.HashMapsAndSets

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    nums.forEachIndexed { index, i ->
        map.put(i, index)
    }

    for (i in 0..nums.size) {
        val y = target - nums[i]
        if(map.containsKey(y) && map[y] != i) {
            return intArrayOf(map[y]!!, i)
        }
    }

    throw Exception("There is no solution")
}

fun main() {
    println(twoSum(nums = intArrayOf(2,7,11,15), target = 9).toList())
}