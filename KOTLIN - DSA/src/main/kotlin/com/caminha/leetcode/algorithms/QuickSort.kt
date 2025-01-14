package com.caminha.leetcode.algorithms

class QuickSort {
    fun recursiveSum(numbers: List<Int>): Int {
        // base case
        if(numbers.isEmpty()) return 0
        if(numbers.size == 1) return numbers.first()

        //recursive case
        //an easy way of getting a fraction of a list in kotlin
        //.slice get a fraction of the list based on a IntRange
        return numbers.first() + recursiveSum(numbers.slice(1..(numbers.size - 1)))
    }


    fun quickSort(numbers: List<Int>): List<Int> {
        if (numbers.size < 2) {
            return numbers
        } else {
            val pivot = numbers[(numbers.size / 2)]

            val less = numbers.filter {
                it < pivot
            }
            val greater = numbers.filter {
                it > pivot
            }

            return quickSort(less) + pivot + quickSort(greater)
        }
    }
}