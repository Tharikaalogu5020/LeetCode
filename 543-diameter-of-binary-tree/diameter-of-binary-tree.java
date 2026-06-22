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
    public int diameterOfBinaryTree(TreeNode root) {
      if(root==null)
      {
        return 0;
      }
      int left=diameterOfBinaryTree(root.left);
      int right=diameterOfBinaryTree(root.right);
      int diam=height(root.left)+height(root.right);
      return Math.max(diam,Math.max(left,right));

}
public static int height(TreeNode r)
{
    if(r==null)
    {
        return 0;
    }
    int left=height(r.left);
    int right=height(r.right);
    return Math.max(left,right)+1;
}
}