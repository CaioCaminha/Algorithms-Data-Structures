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

fun hasCycleUsingSlowAndFast(head: ListNode?): Boolean {
    var fast = head
    var slow = head

    /**
     * If there's a cycle, at some point the fast and slow will be pointing to the same reference
     * */
    while(fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next

        if(slow == fast) return true
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