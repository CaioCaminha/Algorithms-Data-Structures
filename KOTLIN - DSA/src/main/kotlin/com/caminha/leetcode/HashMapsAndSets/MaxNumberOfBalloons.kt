package com.caminha.leetcode.HashMapsAndSets

import java.awt.SystemColor.text

fun maxNumberOfBalloons(text: String): Int {
    //TODO: Improve Runtime complexity
    //TODO: Improve Memory allocation

    if(text == "") return 0


    val result = hashMapOf<Char, Int>()
    val expected = "balloon"
    var count = 0
    for (c in text) {
        result[c] = result.getOrDefault(c, 0) + 1
    }

    result.toSortedMap()

    while (result.getOrDefault('l', 0) > 1) {
        var currentString = ""
        result.forEach { (char, appearence) ->
            if(appearence == 0 || expected.count{ it == char } == 0 ) return@forEach
            if(appearence >= expected.count{ it == char }) {
                result[char] = result.getOrDefault(char, 0) - expected.count{ it == char }
                currentString += char
            }
        }.also {
            if(currentString == "ablno"){
                count++
            }
            currentString = ""
        }
    }

    return count
}

fun main() {
    println(maxNumberOfBalloons("nlaebolko"))
}