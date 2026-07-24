class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] dif=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int pref=find(nums,0,i+1);
            int suff=find(nums,i+1,nums.length);
            dif[i]=pref-suff;

            
        }
        return dif;
     }
     public int find(int[] nums,int start,int end)
     {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=start;i<end;i++)
        {
            hs.add(nums[i]);
        }
        return hs.size();
     }
}