class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
       int[] dif=new int[nums.length];
       for(int i=0;i<nums.length;i++) 
       {
        int prefix=difference(nums,0,i);
        int suffix=difference(nums,i+1,nums.length-1);
        dif[i]=prefix-suffix;
       }
       return dif;
    }
    public static int difference(int[] nums,int start,int end)
    {
        boolean[] visited=new boolean[1000001];
        int c=0;
        for(int i=start;i<=end;i++)
        {
            if(!visited[nums[i]])
            {
                visited[nums[i]]=true;
                c++;
            }
        }
        return c;
    }

}