package com.caminha.leetcode.stacks

import java.util.Stack

fun isValid(s: String): Boolean {
    val map = HashMap<Char, Char>()

    map.put(')', '(')
    map.put('}', '{')
    map.put(']', '[')

    val stack = Stack<Char>()

    for(c in s.toCharArray()) {
        if(!map.containsKey(c)) {
            stack.push(c)
        } else if(stack.isEmpty() || stack.pop() != map.get(c)) {
            return false
        }
    }

    return stack.isEmpty()

}