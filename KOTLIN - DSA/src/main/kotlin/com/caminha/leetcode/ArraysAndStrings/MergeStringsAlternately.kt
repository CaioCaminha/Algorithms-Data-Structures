package com.caminha.leetcode.ArraysAndStrings

import java.lang.StringBuilder

class MergeStringsAlternately {

    //MY SOLUTION
    /**
     * Always try to reduce the number of loops
     * Divide and Conquer, break the problem into smaller problems
     * **/
    fun mergeAlternately1(word1: String, word2: String): String {
        val totalSize = word1.length + word2.length
        val newString = mutableListOf<Char>()


        for (i in 0..totalSize) {
            word1.getOrNull(i)?.let {
                newString.add(it)
            }

            word2.getOrNull(i)?.let {
                newString.add(it)
            }

        }

        return newString.joinToString(
            separator = ""
        )
    }


    //BETTER SOLUTION FROM LEETCODE
    fun mergeAlternately2(word1: String, word2: String): String {
        val bigger = getBigger(word1, word2)
        val result = StringBuilder()
        var i = 0

        for (i in 0..bigger) {
            if(i < word1.length) {
                result.append(word1[i])
            }
            if(i < word2.length) {
                result.append(word2[i])
            }
        }

        return result.toString()
    }

    private fun getBigger(string1: String, string2: String): Int {
        return if(string1.length >= string2.length) string1.length else string2.length
    }

}


fun main() {
    val merge = MergeStringsAlternately()
    println(
        merge.mergeAlternately2("ab", "pqrs")
    )
}