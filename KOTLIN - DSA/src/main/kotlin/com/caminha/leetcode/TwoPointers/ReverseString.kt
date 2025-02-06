package com.caminha.leetcode.TwoPointers

fun reverseString(s: CharArray): Unit {
    var end = s.size - 1
    var start = 0
    while(start < end) {
        var temp = s[start]
        s[start] = s[end]
        s[end] = temp
        start++
        end--
    }
}

fun main() {

}