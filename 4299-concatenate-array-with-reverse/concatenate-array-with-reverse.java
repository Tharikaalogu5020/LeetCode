class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] result=new int[nums.length*2];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            result[index++]=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            result[index++]=nums[j];
        }
        return result;
    }
}