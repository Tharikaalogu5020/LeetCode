class Solution {
    public int countNegatives(int[][] grid) {
        List<Integer> l=new ArrayList<>();
        for(int n[] : grid)
        {
            for(int num : n)
            {
            l.add(num);
            }
        }
        int c=0;
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i)<0)
            {
              c++;
            }
        }
        return c;
    }
}