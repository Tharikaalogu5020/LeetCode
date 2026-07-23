class Solution {
    public int maxProduct(int[] nums) {
        int left1=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
         
         left1=nums[i]*left1;
         max=Math.max(left1,max);
         if(left1==0)
         {
            left1=1;
         }
         
        }
        int right1=1;
        int max1=Integer.MIN_VALUE;
        for(int j=nums.length-1;j>=0;j--)
        {
            right1=nums[j]*right1;
            max1=Math.max(right1,max1);
            if(right1==0)
            {
                right1=1;
            }
            
        }
        return Math.max(max,max1);
    }
}