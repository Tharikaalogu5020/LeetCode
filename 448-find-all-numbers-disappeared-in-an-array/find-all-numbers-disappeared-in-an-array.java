class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       HashSet<Integer> hs=new HashSet<>();
       for(int n:nums)
       {
        hs.add(n);
       }
       ArrayList<Integer> arr=new ArrayList<>();
       for(int i=1;i<=nums.length;i++)
       {
        if(!hs.contains(i))
        {
            arr.add(i);
        }
       }
       return arr;
    }
}