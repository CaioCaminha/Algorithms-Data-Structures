package com.caminha.leetcode.TwoPointers

fun sortedSquares(nums: IntArray): IntArray {
    val squared = nums.map { it * it }
    return squared.sorted().toIntArray()
}

/**
 * This solution sorts the array at the same time that calculates the square
 * */
fun sortedSquaresTwoPointers(nums: IntArray): IntArray {
    var i = 0
    var j = nums.size - 1
    var end = j
    val result  = IntArray(nums.size)

    while(i <= j) {
        var cur: Int
        if(Math.abs(nums[i]) > Math.abs(nums[j])) {
            cur = nums[i]
            i++
        } else {
            cur = nums[j]
            j--
        }
        result[end] = cur * cur
        end--
    }
    return result
}

fun main() {
    println(
        sortedSquaresTwoPointers(
            intArrayOf(-4,-1,0,3,10)
        ).toList()
    )
}