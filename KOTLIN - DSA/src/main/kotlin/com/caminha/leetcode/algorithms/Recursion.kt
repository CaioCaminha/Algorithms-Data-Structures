package com.caminha.leetcode.algorithms

class Recursion {
    fun recursiveFactorial(n: Int): Int {
        if(n == 2) return 2
        return n * recursiveFactorial(n - 1);
    }

    fun recursiveFibonacci(n: Int): Int{
        if(n < 2) return n
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2)
    }
}
