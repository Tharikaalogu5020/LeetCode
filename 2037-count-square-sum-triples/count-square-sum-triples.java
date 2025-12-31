class Solution {
    public int countTriples(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int res=i*i+j*j;
                int ans=(int)Math.sqrt(res);               
                
                    if(ans<=n&&ans*ans==res)
                    {
                        c++;
                    }
                
            }
        }
        return c;
    }
}