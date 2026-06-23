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


    public TreeNode increasingBST(TreeNode root) {
       Queue<Integer> q=new LinkedList<>();
       inorder(root,q);
       Queue<TreeNode> ans=new LinkedList<>();
       TreeNode nn=new TreeNode(q.poll());
       ans.add(nn);
       while(!q.isEmpty())
       {
         TreeNode curr=ans.poll();
          curr.right=new TreeNode(q.poll());
         ans.add(curr.right);
       }
       return nn;
    }

    public static void inorder(TreeNode root,Queue<Integer> q)
    {
     if(root==null)
     {
        return;
     }
     inorder(root.left,q);
     q.add(root.val);
     inorder(root.right,q);
     }

}