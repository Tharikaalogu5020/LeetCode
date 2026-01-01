class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>=nums[i])
            {
                int add=nums[i-1]-nums[i]+1;
                nums[i]+=add;
                c+=add;
            }
        }
        return c;
    }
}