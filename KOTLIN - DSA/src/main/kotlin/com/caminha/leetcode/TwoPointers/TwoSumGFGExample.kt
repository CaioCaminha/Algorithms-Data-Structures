package com.caminha.leetcode.TwoPointers


fun twoSum(arr: IntArray, target: Int): Boolean {
    arr.sort()

    var left = 0
    var right = arr.size - 1

    while(left < right) {
        val sum = arr[left] + arr[right]
        if(sum == target) {
            return true
        } else if (sum < target) {
            right--
        } else {
            left++
        }
    }
    return false
}

fun main() {
    println(
        twoSum(
            arr = intArrayOf(1,2,3,10,6),
            target = 16,
        )
    )
}