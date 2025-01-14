package com.caminha.leetcode.ArraysAndStrings

import io.netty.handler.codec.http2.Http2FrameLogger.Direction


fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val ans = mutableListOf<Int>()
    if(matrix.isEmpty()) return ans

    val m = matrix.size
    val n = matrix[0].size

    var UP = 0
    var RIGHT = 1
    var DOWN = 2
    var LEFT = 3

    var direction = RIGHT

    var UP_WALL = 0
    var RIGHT_WALL = n
    var DOWN_WALL = m
    var LEFT_WALL = -1 // when you pass the a negative number to an index will return the opposite -> -1 = the last index

    var i = 0
    var j = 0

    while(ans.size != m*n) {
        if(direction == RIGHT) {
            while(j < RIGHT_WALL) {
                ans.add(matrix[i][j])
                j++
            }
            i++
            j--
            RIGHT_WALL--
            direction = DOWN
        } else if (direction == DOWN) {
            while(i < DOWN_WALL){
                ans.add(matrix[i][j])
                i++
            }
            i--
            j--
            DOWN_WALL--
            direction = LEFT
        } else if (direction == LEFT ){
            while ( j > LEFT_WALL) {
                ans.add(matrix[i][j])
                j--
            }
            i--
            j++
            LEFT_WALL++
            direction = UP
        } else if(direction == UP) {
            while (i > UP_WALL) {
                ans.add(matrix[i][j])
                i--
            }
            i++
            j++
            UP_WALL++
            direction = RIGHT
        }
    }

    return ans

}


fun main() {
    val x = listOf("carro", "picape", "carro baixo")

    var response = ""
    x.forEach {
        if (response == "") response = it else response = "$response, $it"
    }
    println(response)
}