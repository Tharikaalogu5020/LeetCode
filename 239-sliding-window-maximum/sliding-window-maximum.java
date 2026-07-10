class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || k<=0 )
        {
            return new int[0];
        }
        int n=nums.length;
        int[] ar=new int[n-k+1];
        Deque<Integer>  d=new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
           while(!d.isEmpty() && d.peekFirst()<=i-k)
           {
            d.pollFirst();
           }
           while(!d.isEmpty() && nums[d.peekLast()]<nums[i])
           {
            d.pollLast();
           }
           d.offerLast(i);

           if(i>=k-1)
           {
             ar[i-k+1]=nums[d.peekFirst()];
           }
        }
        return ar;
    }
}