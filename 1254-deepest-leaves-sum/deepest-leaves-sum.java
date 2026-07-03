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
    public int deepestLeavesSum(TreeNode root) {
       ArrayList<Integer> arr=new ArrayList<>();
       find(root,arr); 
       int s=arr.size()-1;
       return arr.get(s);
    }
    public void find(TreeNode root,ArrayList<Integer> arr)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++)
            {
            TreeNode curr=q.poll();
            sum+=curr.val;
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
            }
            arr.add(sum);
        }
    }
}