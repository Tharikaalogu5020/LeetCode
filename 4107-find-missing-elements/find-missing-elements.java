class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
       // ArrayList<Integer> res=new ArrayList<>();
        for(int n:nums)
        {
            arr.add(n);
            if(max<n)
            {
                max=n;
            }
        }
        for(int non:nums)
        {
            if(non<min)
            {
                min=non;
            }
        }
        for(int i=min;i<=max;i++)
        {
            if(arr.contains(i))
            {
                arr.remove(Integer.valueOf(i));
            }
            else
            {
                arr.add(i);
            }
        }
return arr;
    }
}