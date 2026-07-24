class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int k1=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k1-1);
        reverse(nums,k1,n-1);
        return;
    }
    public void reverse(int[] nums,int start,int end)
    {
        while(start<=end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}