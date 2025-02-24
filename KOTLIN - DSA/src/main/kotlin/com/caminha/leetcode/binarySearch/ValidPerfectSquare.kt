package com.caminha.leetcode.binarySearch

import kotlin.math.absoluteValue


fun isPerfectSquare(num: Int): Boolean {
    var l = 1
    var r = num


    while (l <= r) {
        val mid = (l + r) / 2
        println("mid = $mid")
        val squared = mid.toBigInteger().pow(2)

        if(num.toBigInteger() == squared) {
            return true
        } else if(squared > num.toBigInteger()) {
            r = mid - 1
        } else if(squared < num.toBigInteger()) {
            l = mid + 1
        }
    }

    return false
}


fun main() {

    println(isPerfectSquare(2147395600))

}