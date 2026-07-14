class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
       ArrayList<Character> arr=new ArrayList<>();
       int l=0;
       int r=0;
       int max=Integer.MIN_VALUE;
       while(r<s.length())
       {
           char c=s.charAt(r);
           if(!arr.contains(c))
           {
            arr.add(c);
            r++;
            max=Math.max(max,arr.size());
           }
           else
           {
             arr.remove(Character.valueOf(s.charAt(l)));
              l++;
           }
       } 
       return max;
    }
}