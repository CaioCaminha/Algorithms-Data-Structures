package com.caminha.leetcode.binarySearch

fun searchInsert(nums: IntArray, target: Int): Int {
    var l = 0
    var r = nums.size - 1

    var supposedValue = 0

    while (l <= r) {
        val mid = (l + r) / 2

        if(nums[mid] == target) return mid
        if(nums[mid] > target) r = mid -1
        if(nums[mid] < target) l = mid+1

    }

    return l
}


//FirstBadVersion - Leetcode
fun x(n: Int): Int {
    if(n == 1) return n

    var l = 1
    var r = n
    var badVersion = 1

    while ( l <= r ){
        /**
         * TODO: It avoids possible int overflow of adding l to r
         * It's the preferred way of calculating the mid point between two large numbers
         * */
        var mid = l + (r - l) / 2

        if(isBadVersion(mid)){
            badVersion = mid
            r = mid - 1
        } else {
            l = mid + 1
        }
    }
    return badVersion
}

fun isBadVersion(n: Int): Boolean {
    return n == 1702766719
}

fun main() {
    println(x(2126753390))
}