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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr=new ArrayList<>();
        find(root1,arr);
        find(root2,arr);
        Collections.sort(arr);
        return arr;
    }
    public void find(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null )
        {
            return ;
        }
        find(root.left,arr);
        arr.add(root.val);
        
        find(root.right,arr);
    }
}