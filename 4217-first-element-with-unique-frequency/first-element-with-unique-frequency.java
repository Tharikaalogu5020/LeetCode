class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int nu:nums)
            {
                hm.put(nu,hm.getOrDefault(nu,0)+1);
            }
        for(int v:hm.values())
            {
                h.put(v,h.getOrDefault(v,0)+1);
            }
        for(int n:nums)
            {
               
                if(h.get( hm.get(n))==1)
                {
                    return n;
                }
            }
        return -1;
    }
}