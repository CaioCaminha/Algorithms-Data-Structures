package com.caminha.leetcode.ArraysAndStrings

class ProductOfArrayExceptItself {


    //didn't worked because of performance
    fun productExceptSelf2(nums: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        val map = nums.withIndex().associateBy { it.index }
            .values.map { it: IndexedValue<Int> -> it.value }

        for (i in 0..nums.size-1) {
            answer.add(map.filterIndexed { index, num -> index != i }
                .fold(1){acc, index -> acc * index}.toInt())
        }

        return answer.toIntArray()
    }
}


fun main() {
    print(
        ProductOfArrayExceptItself().productExceptSelf2(
            intArrayOf(-1,1,0,-3,3)
        ).toList()
    )
}