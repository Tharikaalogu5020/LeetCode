class Solution {
    public int maxProduct(int[] nums) {
        int max1=0;
        int max2=0;
        for(int n:nums)
        {
            if(n>max1)
            {
                max2=max1;
                max1=n;
            }
            else if(n>max2)
            {
                max2=n;
            }
        }
      
      
        int ans=max1-1;
        int ans2=max2-1;
        return ans*ans2;
    }
}