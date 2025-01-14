package com.caminha.leetcode.ArraysAndStrings

class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        var result: String = ""
        var currentStr: String = strs.first()

        if(strs.size == 1) return strs.first()

        for(i in 1..strs.size - 1) {
            strs[i].forEach {
                if(it == currentStr.getOrNull(i - 1)) {
                    result += it
                }
            }
        }


        return result
    }



}


//fun main() {
//    return "caio".
//}