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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> normal=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            normal.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<normal.size();i++)
        {
            if(i%2==0)
            {
                even.add(normal.get(i));
            }
            else
            {
                odd.add(normal.get(i));
            }
        }
        even.addAll(odd);
        ListNode dummy=new ListNode(0);
        ListNode dup=dummy;
        for(int v:even)
        {
           dup.next=new ListNode(v);
           dup=dup.next; 
        }
        return dummy.next;
    }
}