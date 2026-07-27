class Solution {
    public int minimumDistance(int[] nums) {
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int n:nums)
       {
        hm.put(n,hm.getOrDefault(n,0)+1);
       }
      
       int min=Integer.MAX_VALUE;
       for(Map.Entry<Integer,Integer> m:hm.entrySet())
       {
          int key=m.getKey();
          int val=m.getValue();
          if(val>=3)
          {
             ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                if(key==nums[i])
                {
                    arr.add(i);
                }
            }
            for(int i=0;i<arr.size()-2;i++)
            {
              for(int j=i+1;j<arr.size()-1;j++)
              {
                for(int k=j+1;k<arr.size();k++)
                {
                      int  ans1=Math.abs(arr.get(i)-arr.get(j));
            int ans2=Math.abs(arr.get(j)-arr.get(k));
            int ans3=Math.abs(arr.get(k)-arr.get(i));
            int res=ans1+ans2+ans3;
            min=Math.min(res,min);
                }

              }
            
            
          }
       }
       }
      

return min==Integer.MAX_VALUE?-1:min;
    }
}