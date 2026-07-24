class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                sum++;
                max=Math.max(sum,max);
            }
            if(nums[i]==0)
            {
             sum=0;
            }
        }
        return max;
    }
}