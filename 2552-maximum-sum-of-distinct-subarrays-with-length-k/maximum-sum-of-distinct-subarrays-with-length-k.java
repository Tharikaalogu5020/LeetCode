class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int left=0;
        long sum=0;
        long max=0;
        for(int right=0;right<nums.length;right++)
        {
            while(hs.contains(nums[right]))
            {
                hs.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            hs.add(nums[right]);
            sum+=nums[right];
            if(right-left+1 ==k)
            {
               
                max=Math.max(max,sum);
                hs.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return max;
    }
}