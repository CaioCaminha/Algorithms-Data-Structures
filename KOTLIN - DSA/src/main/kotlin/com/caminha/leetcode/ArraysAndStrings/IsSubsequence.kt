package com.caminha.leetcode.ArraysAndStrings

class IsSubsequence {
    fun isSubsequence(s: String, t: String): Boolean {
        var comparison = ""
        for (i in t) {
            if(s.contains(i)){
                comparison += i
            }
        }
        val int = comparison.lastIndexOf(s)
        return int >= 0

        //Solution two
        val tMap: Map<Char, Int> = t.associate { it to t.indexOf(it) }
        for (i: Char in s)(
                if(tMap[i] == null){
                    return false
                }
                )
        return true

    }
}