package com.caminha.leetcode.stacks

import java.util.Stack

fun calPoints(operations: Array<String>): Int {
    val stack: Stack<Int> = Stack<Int>()

    for (operation in operations) {
        if(operation == "D") {
            stack.push(stack.peek() * 2 )
        } else if (operation == "C") {
            stack.pop()
        } else if(operation == "+") {
            val temp = stack.pop()
            val newValue = stack.peek() + temp
            stack.push(temp)
            stack.push(newValue)
        } else {
            stack.push(operation.toInt())
        }
    }
    var total = 0

    for(value in stack) {
        total += value
    }

    return total
}