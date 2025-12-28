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
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }
        for(int i=1;i<arr.size();i+=2)
        {
            int tpm=arr.get(i-1);
            arr.set(i-1,arr.get(i));
            arr.set(i,tpm);

        }
        ListNode dummy=new ListNode(0);
        ListNode dup=dummy;
    for(int n:arr)
    {
        dup.next=new ListNode(n);
        dup=dup.next;
    }
    return dummy.next;
    }
}