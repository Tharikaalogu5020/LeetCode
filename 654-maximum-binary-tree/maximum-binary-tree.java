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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       int l=0;
       int r=nums.length-1;
       return method(nums,l,r);
     
    }
    public static TreeNode method(int[] nums,int l,int r)
    {
        if(l>r)
        {
            return null;
        }
        int max=l;
        for(int i=l;i<=r;i++)
        {
            if(nums[i]>nums[max])
            {
                max=i;
            }
        }
        TreeNode nn=new TreeNode(nums[max]);
        nn.left=method(nums,l,max-1);
        nn.right=method(nums,max+1,r);
        return nn;
    }
}