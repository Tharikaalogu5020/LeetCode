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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
      LinkedHashSet<Integer> lk=new LinkedHashSet<>();
      LinkedHashSet<Integer> lk1=new LinkedHashSet<>();
      while(temp!=null)
      {
        if(!lk.add(temp.val))
        {
            lk1.add(temp.val);
        }
        temp=temp.next;
      }
      lk.removeAll(lk1);
      ListNode dummy=new ListNode(0);
      ListNode d=dummy;
      for(int k:lk)
      {
        d.next=new ListNode(k);
        d=d.next;
      }
      return dummy.next;

    }
}