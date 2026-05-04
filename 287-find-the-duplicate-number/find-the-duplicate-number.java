class Solution {
    public int findDuplicate(int[] nums) {
      boolean[] bool=new boolean[nums.length];
      for(int i:nums)
      {
        if(bool[i])
        {
            return i;
        }
        else
        {
            bool[i]=true;
        }
      }
      return 0;
    }
}