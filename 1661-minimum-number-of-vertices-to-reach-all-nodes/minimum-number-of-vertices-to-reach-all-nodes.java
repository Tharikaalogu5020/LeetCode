class Solution {
    public static class ver
    {
        int v;
        int indegree;          // 0,0,0    1,0,0  2,0,0    3,0,0   4,0,0    5,0,0 
        int outdegree;
        ver(int v)
        {
          this.v=v;
          this.indegree=0;
          this.outdegree=0;
        }
    }
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    //  int[] arr=new int[n];
    ArrayList<Integer> ans=new ArrayList<>();
     ArrayList<ver> l=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
         l.add(new ver(i));
         
      }
      for(int j=0;j<edges.size();j++)
      {
       
         int source=edges.get(j).get(0); //0     0,0,1
          int des=edges.get(j).get(1);  //1
          l.get(source).outdegree++;
          l.get(des).indegree++;

        
      }
      for(ver v:l)
      {
        if(v.indegree==0)
        {
            ans.add(v.v);
        }
      }
return ans;
    }
}