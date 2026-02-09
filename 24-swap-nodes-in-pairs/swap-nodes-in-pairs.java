/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
       if(head==null || head.next==null)
       {
        return head;
       }
       ListNode prev=null;
       ListNode temp=head;
       ListNode newnode=head.next;
       while(temp!=null && temp.next!=null)
       {
        ListNode temp2=temp.next;
        ListNode nextpair=temp2.next;
        temp2.next=temp;
        temp.next=nextpair;
        if(prev!=null)
        {
prev.next=temp2;
        }
        prev=temp;
        temp=nextpair;
       }
     return newnode;
       }
    }
