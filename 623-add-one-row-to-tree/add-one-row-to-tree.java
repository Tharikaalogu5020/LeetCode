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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode nn=new TreeNode(val);
            nn.left=root;
            return nn;
        }
        find(root,val,1,depth);
        return root;
    }
    public void find(TreeNode root,int val,int level,int depth)
    {
        if(root==null)
        {
            return;
        }
        if(level+1==depth)
        {
            
                TreeNode root1=root.left;
                TreeNode root2=root.right;
                root.left=new TreeNode(val);
                root.right=new TreeNode(val);
                root.left.left=root1;
                root.right.right=root2;
                return;
            
            
        }
        find(root.left,val,level+1,depth);
        find(root.right,val,level+1,depth);
    }
}