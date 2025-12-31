class Solution {
    public int findFinalValue(int[] nums, int original) {
      return find(nums,original);
    }
    public static int find(int[] nums,int original)
    {
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==original)
        {
            return find(nums,original*2);
        }

       }
       return original;
    }
}