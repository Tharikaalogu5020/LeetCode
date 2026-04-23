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
    public List<String> binaryTreePaths(TreeNode root) {
       ArrayList<String> str=new ArrayList<>();
       ArrayList<Integer> arr=new ArrayList<>();
       preorder( root,arr,str);
       return str;
    }
    public  List<String> preorder(TreeNode root,ArrayList<Integer> arr,ArrayList<String> str)
    {
       if(root==null){
      return str;
      }
      arr.add(root.val);
      if(root.left==null&& root.right==null)
      {
        str.add(convert(arr));
      }
      else
      {
        preorder(root.left,arr,str);
        preorder(root.right,arr,str);
      }
      arr.remove(arr.size()-1);
      return str;
    }
   public static String convert(ArrayList<Integer> arr)
   {
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<arr.size();i++)
    {
        sb.append(arr.get(i));
        if(i!=arr.size()-1)
        {
            sb.append("->");
        }
    }
    return sb.toString();
   }

    
}