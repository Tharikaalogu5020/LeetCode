class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int x=0;
        int max=-1;
        for(Map.Entry<Integer,Integer> mm:hm.entrySet())
        {
            if(mm.getKey().equals(mm.getValue()))
            {
                x=mm.getValue();
                max=Math.max(max,x);
            }
        }
        return max;
    }
}