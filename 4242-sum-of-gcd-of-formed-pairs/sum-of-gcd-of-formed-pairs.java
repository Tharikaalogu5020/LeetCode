class Solution {
    public long gcdSum(int[] nums) {
        int[] arr=new int[nums.length];
       int max=nums[0];
       for(int i=0;i<nums.length;i++)
       {
        max=Math.max(max,nums[i]);
        arr[i]=gcd(max,nums[i]);
       }
       Arrays.sort(arr);
      long val= gcd2(arr);
      return val;
 }
    public int gcd(int s,int e)
    {
        int min=Math.min(s,e);
        int max=Math.max(s,e);
        while(min!=0)
        {
            int rem=max%min;
            max=min;
            min=rem;
        }
        return max;
    }
    public long gcd2(int[] arr)
    {
        int s=0;
        int e=arr.length-1;
        long sum=0;
        while(s<e)
        {
            sum+=gcd(arr[s],arr[e]);
            s++;
            e--;
        }
        return sum;
    }

}