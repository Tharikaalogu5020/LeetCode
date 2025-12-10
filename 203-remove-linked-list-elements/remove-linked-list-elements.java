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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        List<Integer> l=new ArrayList<>();
        while(temp!=null)
        {
            if(temp.val!=val)
            l.add(temp.val);
            temp=temp.next;
        }
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