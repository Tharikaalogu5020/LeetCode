/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     
      if(headA==null && headB==null)
      {
        System.out.print("list is empty");
        return null;
      }
      ListNode temp=headA;
      ListNode temp1=headB;
      while(temp!=temp1)
      {
        temp=(temp!=null)?temp.next:headB;
        temp1=(temp1!=null)?temp1.next:headA;
      }
      return temp1;
    }
}