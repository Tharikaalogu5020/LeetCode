class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int n:apple)
        {
            sum+=n;
        }
        int[] des=new int [capacity.length];
        for(int i=0;i<capacity.length;i++)
        {
            for(int j=i+1;j<capacity.length;j++)
            {
                if(capacity[i]<capacity[j])
                {
                    int temp=capacity[i];
                    capacity[i]=capacity[j];
                    capacity[j]=temp;

                }
            }

        }
        int box=0;
        for(int i=0;i<capacity.length;i++)
        {
            sum-=capacity[i];
            box++;
            if(sum<=0)
            {
                break;
            }

        }
        return box;

    }
}