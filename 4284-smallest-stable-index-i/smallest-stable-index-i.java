class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max;
        int min;
        int i;
        int bal;
        for(i=0;i<nums.length;i++)
        {
             max=Integer.MIN_VALUE;
             min=Integer.MAX_VALUE;
            
               for(int o=0;o<=i;o++)
               {
                 max=Math.max(nums[o],max);
               } 
               for(int l=i;l<nums.length;l++)
               {
                min=Math.min(nums[l],min);
               }
            
            bal=max-min;
            if(bal<=k)
            {
                return i;
            }
        }
        return -1;
        
    }
}