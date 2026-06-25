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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        firsttree(root1,arr); 
         secondtree(root2,arr1);
       return arr.equals(arr1);
    }
    public ArrayList<Integer> firsttree(TreeNode root1,ArrayList<Integer> arr)
    {
        if(root1==null)
        {
            return arr;
        }
        if(root1.left==null && root1.right==null)
        {
            arr.add(root1.val);
        }
        firsttree(root1.left,arr);
        firsttree(root1.right,arr);
        return arr;
    }
    public ArrayList<Integer> secondtree(TreeNode root2,ArrayList<Integer> arr1)
    {
        if(root2==null)
        {
            return arr1;
        }
        if(root2.left==null && root2.right==null)
        {
            arr1.add(root2.val);
        }
        secondtree(root2.left,arr1);
        secondtree(root2.right,arr1);
        return arr1;
    }
    
}