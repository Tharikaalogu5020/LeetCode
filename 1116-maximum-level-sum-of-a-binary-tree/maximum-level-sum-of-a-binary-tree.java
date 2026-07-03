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
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
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
        int max=Integer.MIN_VALUE;
        int level=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>max)
            {
                max=arr.get(i);
                level=i;
            }
        }
        return level+1;

    }
}