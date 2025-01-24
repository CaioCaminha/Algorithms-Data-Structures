package com.caminha.leetcode.LinkedLists


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun deleteDuplicates(head: ListNode?): ListNode? {
    var current = head
    while (current != null && current?.next != null) {
        if (current.`val` == current.next?.`val`) {
            current.next = current.next?.next
        } else {
            current = current.next
        }
    }
    return head
}

fun main() {
    println(
        deleteDuplicates(
            ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(2)
                }
            }
        )
    )
}