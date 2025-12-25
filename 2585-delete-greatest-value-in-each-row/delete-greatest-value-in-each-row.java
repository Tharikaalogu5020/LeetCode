class Solution {
    public int deleteGreatestValue(int[][] grid) {
       for(int[] n:grid)
       {
        Arrays.sort(n);
       }
       int sum=0;
       for(int i=0;i<grid[0].length;i++)
       {
        int max=grid[0][i];

        for(int j=0;j<grid.length;j++)
        {
            if(max<grid[j][i])
            {
                max=grid[j][i];
            }
           
        }
         sum+=max;
       }
       return sum;
    }
}