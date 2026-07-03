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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++)
        {
          root=built(root,preorder[i]);
        }
        return root;
    }
    public TreeNode built(TreeNode root,int data)
    {
        if(root==null)
        {
            return new TreeNode(data);
        }
        if(data<root.val)
        {
        root.left=built(root.left,data);
        }
        if(data>root.val)
        {
            root.right=built(root.right,data);
        }
        return root;
    }
}