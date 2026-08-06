class Solution {
    public int smallestNumber(int n, int t) {
         
       
            for(int i=n;i<=100;i++)
            {
                int rem=find(i,t);
                if(rem==0)
                {
                    return i;
                }
            }
            return n;
        
    }
    public int find(int n,int t)
    {
        int digit=1;
        while(n>0)
        {
            int rem=n%10;
             digit*=rem;
             n/=10;
        }
        return digit%t;
    }   
    
}