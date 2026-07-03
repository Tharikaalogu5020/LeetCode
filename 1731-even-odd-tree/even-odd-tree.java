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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int l=0;
        while(!q.isEmpty())
        {
            ArrayList<Integer> arr=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                arr.add(curr.val);
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            if(l%2==0)
            {
              if(!(isodd(arr) && isinc(arr)))
              {
                   return false;
              }
            }
            else
            {
                if(!(iseven(arr)&&isdec(arr)))
                {
                   return false;
                }

            }
            l++;
        }
        return true;
    }
    public boolean isodd(ArrayList<Integer> arr)
    {
        for(int n:arr)
        {
            if(n%2==0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean iseven(ArrayList<Integer> arr)
    {
        for(int n:arr)
        {
            if(n%2!=0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean isinc(ArrayList<Integer> arr)
    {
        for(int i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i)>=arr.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
    public boolean isdec(ArrayList<Integer> arr)
    {
        for(int i=arr.size()-1;i>0;i--)
        {
            if(arr.get(i) >=arr.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
}