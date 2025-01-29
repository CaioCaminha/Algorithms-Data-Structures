package com.caminha.leetcode.LinkedLists

import kotlin.concurrent.timer
import kotlin.concurrent.timerTask


fun hasCycle(head: ListNode?): Boolean {
    val set = HashSet<ListNode>()
    var cur:ListNode? = head
    while (cur!= null) {
        if(set.contains(cur)) return true
        set.add(cur)
        cur = cur.next
    }
    return false
}

fun main() {
    hasCycle(
        head = ListNode(3).apply {
            next = ListNode(2).apply {
                next = ListNode(-4)
            }
        },
    )
}