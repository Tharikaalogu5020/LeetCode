class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        
            
            int val=rev(nums[i]);
            
            s.add(val);
        }
       return s.size();
    }
    public int rev(int v)
    {
        String str=Integer.toString(v);
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        String s=sb.toString();
        return Integer.parseInt(s);
    }
}