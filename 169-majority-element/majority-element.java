class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int n:nums)
       {
        hm.put(n,hm.getOrDefault(n,0)+1);
       }
       int max=Integer.MIN_VALUE;
      int ans=0;
       for(Map.Entry<Integer,Integer> h:hm.entrySet())
       {
           int key=h.getKey();
           int val=h.getValue();
           if(val>max)
           {
            max=Math.max(max,val);
            ans=key;
           }

       }
       return ans;
       
    }
}