package com.caminha.leetcode.algorithms

class SelectionSort {
    fun findSmaller(list: List<Int>): Int {
        var smallest = list[0]
        var smallestIndex = 0

        for (i in 1..list.size) {
            if(list[i] < smallest) {
                smallest = list[i]
                smallestIndex = i
            }
        }

        return smallestIndex

    }
}