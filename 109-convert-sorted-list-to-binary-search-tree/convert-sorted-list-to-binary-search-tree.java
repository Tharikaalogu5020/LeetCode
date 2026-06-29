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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
       // ListNode temp=null;
      
        return mid(head,null);
    }
    public TreeNode mid(ListNode head,ListNode temp)
    {
        if(head==temp)
        {
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=temp && fast.next!=temp)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        TreeNode nn=new TreeNode(slow.val);
        nn.left=mid(head,slow);
        nn.right=mid(slow.next,temp);
        return nn;
    }
}