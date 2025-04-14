package com.caminha.leetcode.HashMapsAndSets

fun majorityElement(nums: IntArray): Int {
    val mapping = hashMapOf<Int, Int>()
    for(num in nums) {
        if(mapping.containsKey(num)) {
            mapping[num] = mapping[num]!!.plus(1)
        } else {
            mapping.put(num, 1)
        }
    }

    var maxCount = 0
    var ans = 0



    mapping.entries.forEach { entry ->
        if(entry.value > maxCount) {
            maxCount = entry.value
            ans = entry.key
        }
    }

    return ans
}

fun majorityElementsConstantTime(nums: IntArray): Int {
    if(nums.size == 1) {return nums[0]}

    var ans = 0
    var count = 0

    for (num in nums) {
        if(count == 0) {
            ans = num
            count = 1
        } else if(ans == num) {
            count++
        } else {
            count--
        }
    }
    return ans
}

fun main() {
    // Solve the problem in Linear time and with space complexity of O(1)

    println(majorityElement(intArrayOf(3,3,4)))
}