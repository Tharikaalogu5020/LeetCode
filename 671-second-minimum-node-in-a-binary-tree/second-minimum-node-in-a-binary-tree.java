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
    long first=Long.MAX_VALUE;
    long second=Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        find(root);
        if(second==Long.MAX_VALUE)
        {
            return -1;
        }
        return (int)second;
    }
    
    public void find(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(root.val<first)
        {
            second=first;
            first=root.val;
        }
        else if(root.val>first && root.val<second)
        {
            second=root.val;        
        }
        find(root.left);
        find(root.right);
        
}
}
