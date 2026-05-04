class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        int[] post=new int[nums.length];
        int res[]=new int[nums.length];
        
        
            //pre
            pre[0]=1;
            for(int j=1;j<nums.length;j++)
            {
                pre[j]=pre[j-1]*nums[j-1];
            }
            //post
            post[nums.length-1]=1;
            for(int k=nums.length-2;k>=0;k--)
            {
                post[k]=nums[k+1]*post[k+1];
            } 
            for(int i=0;i<nums.length;i++)
            {
                res[i]=pre[i]*post[i];
            }
        
        return res;
     }
}