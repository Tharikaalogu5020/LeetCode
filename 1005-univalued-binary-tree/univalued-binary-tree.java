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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
        {
            return true;
        }
       Queue<TreeNode> q=new LinkedList<>();
       Set<Integer> s=new HashSet<>();
       q.add(root);
       s.add(root.val);
       while(!q.isEmpty())
       {
        TreeNode curr=q.poll();
        s.add(curr.val);
        if(curr.left!=null)
        {
            q.add(curr.left);
            
        }
        if(curr.right!=null)
        {
            q.add(curr.right);
            
        }
       }
    return s.size()==1;
    
    }
    

}