package com.caminha.leetcode.ArraysAndStrings

class RomanToInteger {
    fun romanToInt(s: String): Int {
        var result = 0
        val romanMapping = hashMapOf<Char, Int>(
            Pair('I', 1),
            Pair('V', 5),
            Pair('X', 10),
            Pair('L', 50),
            Pair('C', 100),
            Pair('D', 500),
            Pair('M', 1000)
        )

        if(s.contains("IV")) {
            s.replace("IV", "")
            result += 4
        }
        if(s.contains("IX")) {
            s.replace("IX", "")
            result += 9
        }

        if(s.contains("XL")) {
            s.replace("XL", "")
            result += 40
        }

        if(s.contains("XC")) {
            s.replace("XC", "")
            result += 90
        }

        if(s.contains("CD")) {
            s.replace("CD", "")
            result += 400
        }

        if(s.contains("CM")) {
            s.replace("CM", "")
            result += 900
        }

        println(s)

        s.forEach {
            result += romanMapping.get(it) ?: 0
        }

        return result

    }


}

fun main() {
    val roman = RomanToInteger()
    println(
        roman.romanToInt("MCMXCIV")
    )
}