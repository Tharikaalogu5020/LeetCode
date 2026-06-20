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
    TreeNode prev=null;
    int min=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
       inorder(root);
       return min; 
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }
        inorder(root.left);
        if(prev!=null)
        {
            int dif=root.val-prev.val;
            min=Math.min(min,dif);
        }
        prev=root;
        inorder(root.right);


    }
}