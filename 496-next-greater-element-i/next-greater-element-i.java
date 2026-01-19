class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            int found=-1;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                   for(int k=j+1;k<nums2.length;k++)
                   {
                       if(nums2[k]>nums2[j])
                       {
                        found=nums2[k];
                        break;
                       }
                   }
                   break;

                }
            }
            a.add(found);
        }
        int[] res=new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            res[i]=a.get(i);
        }
        return res;
    }
}