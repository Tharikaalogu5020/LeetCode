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

    public void flatten(TreeNode root) {
        ArrayList<TreeNode> arr=new ArrayList<>();
        preorder(root,arr);
       if(root==null)
       {
        return;
       }
        for(int i=0;i<arr.size()-1;i++)
        {
            arr.get(i).left=null;
            arr.get(i).right=arr.get(i+1);
        }
        arr.get(arr.size()-1).left=null;
        arr.get(arr.size()-1).right=null;

    }
    public static void preorder(TreeNode root,ArrayList<TreeNode> arr)
    {
        if(root==null)
        {
            return;
        }
        arr.add(root);
        preorder(root.left,arr);
        preorder(root.right,arr);
    }
}