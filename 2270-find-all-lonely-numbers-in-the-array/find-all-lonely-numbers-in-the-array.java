class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int n:nums)
        {
            m.put(n,m.getOrDefault(n,0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(m.get(nums[i])==1 && !m.containsKey(nums[i]+1) && !m.containsKey(nums[i]-1))
            {
                a.add(nums[i]);
            }
        }
        return a;
        
    }
}