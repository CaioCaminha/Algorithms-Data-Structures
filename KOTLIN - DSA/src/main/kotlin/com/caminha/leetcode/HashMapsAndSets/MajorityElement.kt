package com.caminha.leetcode.HashMapsAndSets

fun majorityElement(nums: IntArray): Int {
    val mapping = mutableMapOf<Int, Int>()
    for(num in nums) {
        mapping[num] = mapping.getOrDefault(num, 1) + 1
    }

    return mapping.maxBy {
        it.value
    }.key

}

fun main() {
    // Solve the problem in Linear time and with space complexity of O(1)

    println(majorityElement(intArrayOf(3,3,4)))
}