class Solution {
    public int getLeastFrequentDigit(int n) {
        String str=String.valueOf(n);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            int digit=str.charAt(i)-'0';
            hm.put(digit,hm.getOrDefault(digit,0)+1);
        }
        int min=Integer.MAX_VALUE;
       for(int freq:hm.values())
       {
        min=Math.min(min,freq);
       }
       int min1=Integer.MAX_VALUE;
       for(int num:hm.keySet())
       {
        if(hm.get(num)==min)
        {
            min1=Math.min(min1,num);
        }
       }
       return min1; 
    }
}