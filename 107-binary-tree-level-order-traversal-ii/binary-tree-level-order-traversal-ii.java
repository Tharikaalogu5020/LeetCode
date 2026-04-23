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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
          List<List<Integer>> arr=new ArrayList<>();
          if(root==null) return arr;
          q.add(root);
           while(!q.isEmpty())
            {
                List<Integer> l=new ArrayList<>();
                 int size=q.size();
                 for(int i=0;i<size;i++)
                  {
                      TreeNode store=q.poll();
                     l.add(store.val);
                    if(store.left!=null)
                    {
                         q.add(store.left);
                      }
                     if(store.right!=null)
                      {
                         q.add(store.right);
                     }
                 }
                arr.add(l);
          }
            Collections.reverse(arr); 
            return arr;
           }
           } 
