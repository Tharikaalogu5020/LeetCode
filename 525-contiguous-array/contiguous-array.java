class Solution {
    public int findMaxLength(int[] nums) {
      int[] diff_bet = new int[nums.length * 2 + 1];
        Arrays.fill(diff_bet,nums.length);
          diff_bet[nums.length] =-1;
       int zero=0;
       int one=0;
       int differ=0;
       int res=0;
       int max=0;
   
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        {
            zero++;
        }
        else
        {
            one++;

        }
      
        differ=zero-one;//1 
        // int val=differ>=0?differ:(-differ)+nums.length;
        int val = differ + nums.length;
        if(diff_bet[val]==nums.length)
        {
            diff_bet[val]=i;
        }
        else
        {
            res=i-diff_bet[val];
            if(res>max)
            {
                max=res;
            }
        }

       }
       return max;
    }
}