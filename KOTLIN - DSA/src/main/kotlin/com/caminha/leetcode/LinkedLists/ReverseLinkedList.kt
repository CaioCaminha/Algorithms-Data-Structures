package com.caminha.leetcode.LinkedLists

fun reverseList(head: ListNode?): ListNode? {
    var current = head
    var prev: ListNode? = null
    while (current != null) {
        val temp = current.next
        current.next = prev
        prev = current
        current = temp
    }

    return prev
}

fun recursiveReverseLinkedList(head: ListNode?): ListNode? {
    if(head == null) return null

    var newHead = head
    if(head.next != null) {
        newHead = reverseList(head.next)
        head.next?.next = head
    }
    head.next = null
    return newHead
}

fun anotherReverseLinkedList(prev: ListNode?, current: ListNode?): ListNode? {
    if(current == null) return prev // prev will be the last item since current is null

    var next = current.next
    current.next = prev

    return anotherReverseLinkedList(
        prev = current,
        current = next
    )
}


fun betterRecursiveReverseLinkedList(head: ListNode?): ListNode? {
    return recursive(null, head)
}

fun recursive(prev: ListNode?, cur: ListNode?): ListNode? {
    if(cur ==null) return prev

    // swapping the fucking nodes
    var newNext = cur.next
    cur.next = prev

    //moving fucking foward passing cur as prev and newNext as cur
    return recursive(
        prev = cur,
        cur = newNext
    )
}

fun main() {
    println(
        reverseList(
            ListNode(1).apply {
                next = ListNode(1).apply {
                    next = ListNode(2)
                }
            }
        )
    )
}