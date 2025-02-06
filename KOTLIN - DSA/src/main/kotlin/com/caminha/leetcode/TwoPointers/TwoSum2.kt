package com.caminha.leetcode.TwoPointers

fun twoSum2(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1
    while (left < right) {
        val sum = numbers[left] + numbers[right]
        when {
            sum == target -> return intArrayOf(left +1 , right+1)
            sum < target -> left++
            else -> right--
        }
    }


    throw Exception()
}