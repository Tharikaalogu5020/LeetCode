class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
         int[] arr=new int[queries.length];
         for(int i=0;i<queries.length;i++)
         {
            long a=queries[i][0];
            long b=queries[i][1];
            int dia=0;
            while(a!=b)
            {
                if(a>b)
                {
                   a=a/2;
                }
                else
                {
                    b=b/2;
                }
                dia++;
            }
            arr[i]=dia+1;
         }
         return arr;
    }
}