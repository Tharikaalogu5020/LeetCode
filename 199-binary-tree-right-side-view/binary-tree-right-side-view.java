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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        
         find(root,0,arr);

         return arr;
    }
    public void find(TreeNode root,int level,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        if(level==arr.size())
        {
            arr.add(root.val);
        }
      
      
        
        find(root.right,level+1,arr);
        find(root.left,level+1,arr);
    }
}