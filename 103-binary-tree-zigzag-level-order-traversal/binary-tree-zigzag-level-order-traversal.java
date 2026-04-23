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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> q=new ArrayDeque<>();
        List<List<Integer>> arr=new ArrayList<>();
        if (root == null) return arr;
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty())
        {
            ArrayList<Integer> l=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
            if(flag==false)
            {
                TreeNode store=q.pollFirst();
                l.add(store.val);
                if(store.left!=null)
                {
                    q.addLast(store.left);
                }
                if(store.right!=null)
                {
                    q.addLast(store.right);
                }
            }
            else
            {
                TreeNode store=q.pollLast();
                l.add(store.val);
                if(store.right!=null)
                {
                    q.addFirst(store.right);
                }
                if(store.left!=null)
                {
                    q.addFirst(store.left);
                }
            }
            }
            arr.add(l);
            flag=!flag;

        }
        return arr;
    }
     
}