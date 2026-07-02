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
    Map<Integer,Integer> m=new HashMap<>();
    ArrayList<Integer> arr=new ArrayList<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        find(root,m);
       int max= findmax(m);
       for(Map.Entry<Integer,Integer> n:m.entrySet())
       {
           if(n.getValue()==max)
           {
              arr.add(n.getKey());
           }
       }
       int[] a=new int[arr.size()];
       for(int i=0;i<arr.size();i++)
       {
        a[i]=arr.get(i);
       }
       return a;
    }
    public int find(TreeNode root,Map<Integer,Integer> m)
    {
        if(root==null)
        {
            return 0;
        }
        int left=find(root.left,m);
        int right=find(root.right,m);
        int val=left+right+root.val;
        m.put(val,m.getOrDefault(val,0)+1);
        return val;
       
    }
    public int findmax(Map<Integer,Integer> m)
    { 
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> m1:m.entrySet())
        {
            max=Math.max(m1.getValue(),max);
        }
        return max;
    }
}