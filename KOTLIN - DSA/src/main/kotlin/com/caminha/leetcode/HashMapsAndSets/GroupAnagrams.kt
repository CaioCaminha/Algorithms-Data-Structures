package com.caminha.leetcode.HashMapsAndSets

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    if(strs.size == 1) return listOf(strs.toList())

    val sortedMap = mutableMapOf<String, Set<Int>>()
    val result = mutableListOf<List<String>>()
    strs.forEachIndexed { index, s ->
        val sorted = s.toCharArray().sorted().joinToString("")
        if(sortedMap.containsKey(sorted)) {
            val currentIndexes = sortedMap[sorted]
            sortedMap[sorted] = currentIndexes!! + setOf(index)
        }else {
            sortedMap.put(sorted, setOf(index))
        }
    }

    sortedMap.values.forEach { value ->
        result.add(
            value.map {
                strs[it]
            }
        )
    }

    return result
}

fun compareStrings(list: List<String>): Boolean {
    val sortedMap = mutableMapOf<String, Set<Int>>()
    val result = mutableListOf<List<String>>()
    list.forEachIndexed { index, s ->
        val sorted = s.toCharArray().sorted().joinToString("")
        if(sortedMap.containsKey(sorted)) {
            val currentIndexes = sortedMap[sorted]
            sortedMap[sorted] = currentIndexes!! + setOf(index)
        }else {
            sortedMap.put(sorted, setOf(index))
        }
    }

//    sortedMap.entries.forEach { (key, value) ->
//        result.add(
//            value.map {
//                list[it]
//            }
//        )
//    }
//
    sortedMap.values.forEach { value ->
        result.add(
            value.map {
                list[it]
            }
        )
    }

    println(result)


    return true
}

fun something(str: String) {
    for(c in str.toCharArray()) {
        println(c - 'a')
    }
}

fun main() {
    //println(groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat")))
    println(something("eat"))
}