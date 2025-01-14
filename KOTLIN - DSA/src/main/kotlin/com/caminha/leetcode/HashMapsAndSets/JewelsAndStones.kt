package com.caminha.leetcode.HashMapsAndSets

import kotlin.concurrent.thread

class JewelsAndStones {

    fun numJewelsInStones(jewels: String, stones: String): Int {
        var count = 0
        val jewelsMap = HashSet<Char>()

        for(char in jewels){
            jewelsMap.add(char)
        }

        for(char in stones) {
            if (jewels.contains(char)) count++
        }

        return count

    }

}