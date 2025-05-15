from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseLinkedList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = head
        prev = None

        while cur:
            temp = cur.next
            cur.next = prev
            prev = cur
            cur = temp

        return prev


    def recursiveLinkedList(self,head: Optional[ListNode]) -> Optional[ListNode]:
        return self.recursive(None, head)


    def recursive(self, prev: Optional[ListNode], current: Optional[ListNode]) -> Optional[ListNode]:

