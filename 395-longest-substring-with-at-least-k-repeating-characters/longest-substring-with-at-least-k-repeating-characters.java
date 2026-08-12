class Solution {
    public int longestSubstring(String s, int k) {
        int max=0;
         for(int left = 0; left < s.length(); left++)
        {
            int[] freq=new int[26];
        for(int right=left;right<s.length();right++)
        {
           freq[s.charAt(right)-'a']++;
           if(freq(freq,k))
           {
      
            max=Math.max(right-left+1,max);
        
           }
          

        }
        }
        return max;
    }
    public boolean freq(int[] freq,int k)
    {
        /*HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(Map.EntrySet<>)*/
       boolean check=true;
    
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0 &&freq[i]<k)
            {
                check= false;
                break;
                 
            }
        }
      
        return check;
    }
}