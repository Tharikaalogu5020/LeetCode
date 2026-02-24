class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int n:arr)
        {
            m.put(n,m.getOrDefault(n,0)+1);
        }
        
        int max=-1;
        for(Map.Entry<Integer,Integer> entry:m.entrySet())
        {
            if(entry.getKey().equals(entry.getValue()))
            {
             
max=Math.max(max,entry.getKey());
            }
        }
        return max;
    }
}