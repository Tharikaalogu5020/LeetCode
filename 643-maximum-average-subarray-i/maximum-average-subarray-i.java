class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++)
        {
        sum+=nums[i];
        }
        max=sum;
        for(int j=k;j<nums.length;j++)
        {
            sum=sum-nums[j-k]+nums[j];
            max=Math.max(sum,max);
        }
        return (double)max/k;
    }
}