/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    ArrayList<Integer> arr=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        pos(root,arr);
        return arr;
    }
    public static void pos(Node root,ArrayList<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        
        for(Node child:root.children)
        {
            pos(child,arr);
        }
       
    arr.add(root.val);
        
    }
}