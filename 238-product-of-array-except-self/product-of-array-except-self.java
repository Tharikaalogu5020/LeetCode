class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        int[] res=new int[nums.length];
        arr1[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            arr1[i]=arr1[i-1]*nums[i-1];
        }
        arr2[nums.length-1]=1;
        for(int j=nums.length-2;j>=0;j--)
        {
            arr2[j]=arr2[j+1]*nums[j+1];
        }
        for(int i=0;i<arr1.length;i++)
        {
            res[i]=arr1[i]*arr2[i];
        }
        return res;
    }
}