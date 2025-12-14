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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> a=new ArrayList<>();
        while(temp!=null)
        {
            a.add(temp.val);
            temp=temp.next;
        }
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer();
        for(int n:a)
        {
          
            sb.append(Integer.toString(n));
        }
        for(int n:a)
        {
          
            sb1.append(Integer.toString(n));
        }
        sb.reverse();
        if(sb.toString().equals(sb1.toString()))
        {
            return true;
        }
        return false;
    }
}