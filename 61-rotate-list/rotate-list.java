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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        List<Integer> l=new ArrayList<>();
        while(temp!=null)
        {
            l.add(temp.val);
            temp=temp.next;
        }
        Collections.rotate(l,k);
        ListNode dummy=new ListNode(0);
        ListNode d=dummy;
        for(int n:l)
        {
            d.next=new ListNode(n);
            d=d.next;
        }
        return dummy.next;
    }
}