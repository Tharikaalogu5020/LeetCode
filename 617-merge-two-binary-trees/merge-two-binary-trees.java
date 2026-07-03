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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return create(root1,root2);

    }
    public TreeNode create(TreeNode root1,TreeNode root2)
    {
        if(root1==null)
        {
            return root2;
        }
        if(root2==null)
        {
            return root1;
        }
        TreeNode nn=new TreeNode(root1.val+root2.val);
        nn.left=create(root1.left,root2.left);
        nn.right=create(root1.right,root2.right);
        return nn;
        
    }
}