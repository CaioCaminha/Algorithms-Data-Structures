package com.caminha.leetcode.HashMapsAndSets


fun recurringElement(nums: List<Int>): Int? {
    val mapping = mutableMapOf<Int, Int>()
    for (num in nums) {
        if (mapping.containsKey(num)) { return num }
        mapping[num] = mapping.getOrDefault(num, 0) + 1
    }
    return null
}

fun main() {
    println(recurringElement(listOf(2,1,3,2,4,1)))
}