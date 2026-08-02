class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
           if(k <= 1)
            return 0;
       int left=0; 
       int c=0;
        int product=1;
       for(int r=0;r<nums.length;r++)
       {
         
         product*=nums[r];
          while(product>=k)
          {
            product/=nums[left];
            left++;
          }
          
            c+=r-left+1;
          
          
       }
       return c;
    }
}