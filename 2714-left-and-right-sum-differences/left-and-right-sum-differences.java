class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        left[0]=0;
        int sum=left[0];
        for(int i=0;i<nums.length-1;i++)
        {
              left[i+1]=sum+nums[i];
              sum=left[i+1];
        }
        right[nums.length-1]=0;
        int sum1=right[nums.length-1];
        for(int i=nums.length-1;i>0;i--)
        {
            right[i-1]=sum1+nums[i];
            sum1=right[i-1];
        }
        int[] res=new int[nums.length];
        for(int j=0;j<nums.length;j++)
        {
            res[j]=Math.abs(left[j]-right[j]);
        }
        return res;
    }
}