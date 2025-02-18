package com.caminha.leetcode.stacks

import java.util.Stack

fun evalRPNBetterSolution(tokens: Array<String>): Any {
    val stack = Stack<Int>()

    for(token in tokens) {
        when (token) {
            "+", "-", "*", "/" -> stack.push(calculate(stack.pop(), stack.pop(), token))
            else -> stack.push(token.toInt())
        }
    }

    return if(stack.isNotEmpty()) stack.pop() else 0
}

private fun calculate(num1: Int, num2: Int, operator: String): Int {
    when(operator) {
        "+" -> return num2 + num1
        "-" -> return num2 - num1
        "*" -> return num2 * num1
        "/" -> return num2 / num1
        else -> return 0
    }
}

fun evalRPN(tokens: Array<String>): Any {
    val newTokens = tokens.toMutableList()
    val stack = Stack<Int>()

    newTokens.forEach {
        val current: Int? = try {
           it.toInt()
        }catch (_: NumberFormatException) { null }


        if(current != null) {
            stack.push(current)
        } else {
            if(it == "+") {
                val lastOne = stack.pop()
                val beforeLastOne = stack.pop()
                stack.push(beforeLastOne + lastOne)
            } else if(it == "-") {
                val lastOne = stack.pop()
                val beforeLastOne = stack.pop()
                stack.push(beforeLastOne - lastOne)
            } else if(it == "*") {
                val lastOne = stack.pop()
                val beforeLastOne = stack.pop()
                stack.push(beforeLastOne * lastOne)
            }else if(it == "/") {
                val lastOne = stack.pop()
                val beforeLastOne = stack.pop()
                stack.push(beforeLastOne / lastOne)
            }
        }

    }



    return stack.pop()
}

fun main() {
    println(
        evalRPN(
            arrayOf("10","6","9","3","+","-11","*","/","*","17","+","5","+")
        )
    )
}