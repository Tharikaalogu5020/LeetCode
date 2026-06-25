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
    
    static int ans=0;
    static int height=-1;
    public int findBottomLeftValue(TreeNode root) {
       ans=root.val;
       height=-1;
       find(root,0);
       return ans;
       
    }
 
    public static void find(TreeNode root,int height1)
    {
      if(root==null)
      {
        return;
      }  
        if(root.left==null && root.right==null)
        {
            if(height1>height)
            {
                ans=root.val;
                height=height1;
            }
        }
        find(root.left,height1+1);
        find(root.right,height1+1);
    }

}
