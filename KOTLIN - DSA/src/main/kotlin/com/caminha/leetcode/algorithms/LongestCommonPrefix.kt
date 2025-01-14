package com.caminha.leetcode.algorithms

class LongestCommonPrefix {

    class Solution {
        fun longestCommonPrefix(strs: Array<String>): String {
            var intersec: Set<Char> = emptySet()

            if(strs.size == 1) return strs.first()

            for(i in 0..<strs.size){
                if(i == 0) {
                    intersec = strs[0].toSet().intersect(strs[1].toSet())
                } else {
                    intersec = intersec.intersect(strs[i].toSet())
                }
            }
            return String(intersec.toCharArray())
        }

        fun longestCommonPrefix2(strs: Array<String>): String {
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



        fun longestCommonPrefix3(strs: Array<String>): String {
            var result = ""

            for(i in 0..strs.size - 1) {
                if(i == 0){
                    result = strs[i]
                    continue
                }

                if(result.length >= strs[i].length) {
                    for (x in 0 .. result.length - 1){
                        if(strs[i].getOrNull(x) == null){
                            result = result.substring(0, x)
                            break
                        }
                        if (result.get(x) != strs[i][x]) {
                            result = result.substring(0, x)
                            break
                        }
                    }


                } else {
                    for (x in 0 .. strs[i].length - 1){
                        if(result.getOrNull(x) == null){
                            result = result.substring(0, x)
                            break
                        }
                        if (strs[i].get(x) != result.get(x)) {
                            result = strs.get(x).substring(0, x)
                            break
                        }
                    }
                }

            }
            return result
        }
    }
}

fun main() {
    LongestCommonPrefix.Solution().longestCommonPrefix3(arrayOf("flower","flow","flight"))
}