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
};
*/

class Solution {
    List<List<Integer>> arr=new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        level(root,arr);
        return arr;
    }
    public static List<List<Integer>> level(Node root,List<List<Integer>> arr)
    {
        if(root==null)
        {
            return arr;
        }
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty())
      {
        ArrayList<Integer> a=new ArrayList<>();
        int size=q.size();
        for(int i=0;i<size;i++)
        {
            Node curr=q.poll();
            a.add(curr.val);
            for(Node child:curr.children)
            {
                q.add(child);
            }
        }
        arr.add(a);
      }
       return arr; 
    }
}