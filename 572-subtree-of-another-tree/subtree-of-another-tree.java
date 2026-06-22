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
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
      Queue<TreeNode> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty())
      {
        TreeNode curr=q.poll();
        if(issame(curr,subroot))
        {
            return true;
        }
        if(curr.left!=null)
        {
            q.add(curr.left);
        }
        if(curr.right!=null)
        {
            q.add(curr.right);
        }
      }
      return false;
    }
    public static boolean issame(TreeNode root,TreeNode root1)
    {
        if(root==null && root1==null) return true;
        if(root.left!=null && root1.left==null || root.left==null && root1.left!=null || root.right!=null && root1.right==null || root.right==null && root1.right!=null)
        {
            return false;
        }
        if(root.val!=root1.val)
        {
            return false;
        }
        return issame(root.left,root1.left) && issame(root.right,root1.right);
    }

}