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
    
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        find(root,arr);
        int v=1;
        int ans=0;
        for(int i:arr)
        {
           if(v==k)
           {
            ans=i;
           }
           v++;
        }
        return ans;
    }
     public void find(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return ;
        }
        find(root.left,arr);
        arr.add(root.val);
        find(root.right,arr);
    }
        

        
     }
