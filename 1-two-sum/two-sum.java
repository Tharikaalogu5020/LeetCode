class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int tar=target-nums[i];
            if(hm.containsKey(tar))
            {
              return new int[]{hm.get(tar),i};
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}