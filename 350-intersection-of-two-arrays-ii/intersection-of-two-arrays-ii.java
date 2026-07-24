class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums1)
        {
            hm.put(n,hm.getOrDefault(n,0)+1); //1-2 2-2
        }
        ArrayList<Integer> arr=new ArrayList<>();
         for(int n1:nums2)
         {
            if(hm.containsKey(n1)&&hm.get(n1)>0)
            {
               arr.add(n1);
               hm.put(n1,hm.get(n1)-1);
            }
         }
         int[] res=new int[arr.size()];
         for(int i=0;i<arr.size();i++)
         {
            res[i]=arr.get(i);
         }
         return res;
    }
}