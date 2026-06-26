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
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
         find(root,"");
         return sum;
    }
    public void find(TreeNode root,String str)
    {
        if(root==null)
        {
            return ;
        }
        str+=Integer.toString(root.val);
        if(root.left==null&& root.right==null)
        {
            sum+=Integer.parseInt(str,2);

        }
        find(root.left,str);
        find(root.right,str);
    }
}