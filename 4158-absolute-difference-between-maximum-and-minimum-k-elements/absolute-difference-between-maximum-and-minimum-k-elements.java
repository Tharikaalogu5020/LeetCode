class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sums=0;
        for(int i=0;i<k;i++)
        {
            sums+=nums[i];
        }
        int suml=0;
        for(int i=nums.length-k;i<nums.length;i++)
        {
            suml+=nums[i];
        }
        return Math.abs(suml-sums);
    }
}