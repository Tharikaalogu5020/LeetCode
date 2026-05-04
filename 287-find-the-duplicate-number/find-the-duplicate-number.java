class Solution {
    public int findDuplicate(int[] nums) {
       Set<Integer> s=new HashSet<>();
       int val=0;
       for(int n:nums)
       {
        if(!s.contains(n))
        {
           s.add(n);
        }
        else
        {
             val=n;
        }
       }
       return val;
    }
}