package com.caminha.leetcode.algorithms

class binarySearch {
    //binary search example using kotlin

    //the function receives the list and the item
    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1

        while (low <= high) {
            val mid = (low + high) / 2
            if(nums[mid] == target) return mid

            if(nums[mid] < target) low = mid + 1

            if(nums[mid] > target) high = mid - 1
        }

        return -1
    }



}

fun recursiveBinarySearch(list: List<Int>, left: Int, right: Int, item: Int): Int? {
    if(right >= left) {
        val mid = left + (right - left) / 2
        if (list[mid] == item) return mid

        if (list[mid] > item) return recursiveBinarySearch(list,left, mid - 1, item )

        return recursiveBinarySearch(list, mid + 1, right, item )
    }
    return -1
}

fun main(args: Array<String>) {

}