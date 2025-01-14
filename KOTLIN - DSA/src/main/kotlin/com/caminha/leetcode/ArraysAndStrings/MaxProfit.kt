package com.caminha.leetcode.ArraysAndStrings

class MaxProfit {
    fun maxProfit(prices: IntArray): Int {
        var buy = prices[0]
        var profit = 0


        prices.forEachIndexed { index, price ->
            if(index > 0) {
                if(price < buy){
                    buy = price
                }else if(
                    price - buy > profit
                ){
                    profit = price - buy
                }
            }
        }
        return profit
    }
}