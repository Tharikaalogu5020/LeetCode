/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
        {
            return "";
        }
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if(curr==null)
            {
               sb.append("#,");
               continue;
            }
           
                sb.append(curr.val).append(",");
            
         q.add(curr.left);
         q.add(curr.right);
            
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0||data==null)
        {
            return null;
        }
        String[] str=data.split(",");
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode nn =new TreeNode(Integer.parseInt(str[0]));
        q.add(nn);
        int i=1;
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            if( !str[i].equals("#"))
            {
                curr.left=new TreeNode(Integer.parseInt(str[i]));
                q.add(curr.left);
            }
            i++;
            if(i<str.length && !str[i].equals("#"))
            {
                curr.right=new TreeNode(Integer.parseInt(str[i]));
                q.add(curr.right);
            }
           i++;

        }
return nn;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));