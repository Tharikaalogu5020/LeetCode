class Solution {
    public int minSwapsCouples(int[] row) {
        int c=0;
        for(int i=0;i<row.length;i+=2)
        {
            int first=row[i];
            int part=first^1;
            int index=0;
            for(int j=0;j<row.length;j++)
            {
                if(row[j]==part)
                {
                    index=j;
                    break;
                }
            }
            if(index!=i+1)
            {
                int temp=row[index];
               row[index]=row[i+1];
               row[i+1]=temp;
               c++;
            }
        }
        return c;
    }
}