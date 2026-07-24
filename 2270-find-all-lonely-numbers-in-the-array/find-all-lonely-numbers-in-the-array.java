class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> h:hm.entrySet())
        {
              int key = h.getKey();
               int value = h.getValue();
            if(value==1 &&!hm.containsKey(key-1)&& !hm.containsKey(key+1))
            {
                arr.add(key);
            }
        }
        return arr;
    }
}