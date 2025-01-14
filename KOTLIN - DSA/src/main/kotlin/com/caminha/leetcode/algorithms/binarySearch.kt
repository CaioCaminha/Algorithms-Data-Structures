package com.caminha.leetcode.algorithms

class binarySearch {
    //binary search example using kotlin

    //the function receives the list and the item
    fun binarySearch(list: List<Int>, item: Int): Int? {
        var low = 0
        var high = list.size - 1

        while (low < high) {
            val mid = (low + high)
            val guess = list[mid]

            if (guess == item) return mid
            if (guess < item) high = mid - 1
            else low = mid + 1
        }

        return null
    }



}

fun main(args: Array<String>) {

}