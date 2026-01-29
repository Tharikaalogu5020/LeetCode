# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        s=head
        f=head
        while(f and f.next):
            f=f.next.next
            s=s.next
        
        prev=None
        while s:
            nxt=s.next
            s.next=prev
            prev=s
            s=nxt
        while(prev):
            if prev.val != head.val:
                return False
            head=head.next
            prev=prev.next
        return True
