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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        List<Integer> l=new ArrayList<>();
        while(temp!=null)
        {
            l.add(temp.val);
            temp=temp.next;
        }
        l.remove(l.size()-n);
        ListNode dummy=new ListNode(0);
        ListNode t=dummy;
        for(int i:l)
        {
           t.next=new ListNode(i);
             t=t.next;
        }
        return dummy.next;
    }
}