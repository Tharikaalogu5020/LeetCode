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
   private List<Integer> arr;
    public List<Integer> largestValues(TreeNode root) {
        arr=new ArrayList<>();
        find(root,0);
        return arr;
    }
    public void find(TreeNode root,int level)
    {
        if(root!=null)
        {
            int val=root.val;
            if(level==arr.size())
            {
                arr.add(val);
            }
            else
            {
                arr.set(level,Math.max(arr.get(level),val));
            }
            find(root.left,level+1);
            find(root.right,level+1);
        }
    }
}