package com.caminha.leetcode.TwoPointers

fun isPalindrome(s: String): Boolean {
    val processedString = s.replace("[^A-Za-z0-9 ]".toRegex(), "").lowercase().replace(" ", "").toCharArray()
    var s = 0
    var j = processedString.size - 1
    while (s < j) {
        if (processedString[s] == processedString[j]) {
            s++
            j--
        } else {
            return false
        }
    }
    return true
}

fun main() {
    isPalindrome("A man, a plan, a canal: Panama")
}