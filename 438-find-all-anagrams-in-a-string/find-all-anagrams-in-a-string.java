class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr=new ArrayList<>();
        int[] freq=new int[26];
        for(char c:p.toCharArray())
        {
            freq[c-'a']++;
        }
    
       for(int i=0;i<s.length()-p.length()+1;i++)
       {
            int[] freq1=new int[26];
           String res=s.substring(i,p.length()+i);
           for(char c:res.toCharArray())
           {
            freq1[c-'a']++;
            }
            if(Arrays.equals(freq,freq1))
            {
               
                   arr.add(i); 
                
            }
        }
        
return arr;
    }
}