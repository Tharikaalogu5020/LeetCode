class Solution {
    public void moveZeroes(int[] nums) {
       int c=0;
       for(int n:nums)
       {
        if(n!=0)
        {
            nums[c++]=n;
        }
       } 
       while(c<nums.length)
       {
        nums[c++]=0;
       }
       System.out.print(Arrays.toString(nums));
    }
}