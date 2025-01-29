package com.caminha.leetcode.LinkedLists

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if(list1 == null) return list2
    if(list2 == null) return list1

    var dummy = ListNode(-1) // I've created a reference to a headNode called dummy
    /**
     * Every time I do a cur.next I'm incrementing the dummy head, So at first cur.next = 1 | cur = cur.next
     * then dummy would be 0 - 1 and cur = 1 then cur.next = 1 would make dummy = 0 - 1 - 1. incrementing dummy
     * This happens because cur was initialized as a reference to the head dummy, so every operation done to
     * cur is being done to dummy, since it's the head.
    **/
    var cur:ListNode? = dummy // I start the cur as the head which is node


    var l1 = list1
    var l2 = list2
    while(l1 != null && l2 != null) {
        if(l1.`val` < l2.`val`) {
            cur?.next = l1
            l1 = l1.next
        } else {
            cur?.next = l2
            l2 = l2.next
        }
        cur = cur?.next
    }
    cur?.next = l1 ?: l2
    return dummy.next
}

fun main() {
    mergeTwoLists(
        list1 = ListNode(1).apply {
            next = ListNode(2).apply {
                next = ListNode(4)
            }
        },
        list2 = ListNode(1).apply {
            next = ListNode(3).apply {
                next = ListNode(4)
            }
        }
    )
}