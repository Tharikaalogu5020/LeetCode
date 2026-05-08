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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> arr=new ArrayList<>();
        return solve(arr,root,targetSum);
    }
    public boolean solve(ArrayList<Integer> arr,TreeNode root,int targetSum)
    {
        if(root==null)
        {
            return false;
        }
        arr.add(root.val);
        if(root.left==null&&root.right==null)
        {
            int sum=0;
           for(int i:arr)
           {
              sum+=i;

           }
           if(sum==targetSum)
           {
            return true;
           }
        }
        
          boolean left=  solve(arr,root.left,targetSum);
           boolean right= solve(arr,root.right,targetSum);
        
        arr.remove(arr.size()-1);
        return left||right;
    }
}