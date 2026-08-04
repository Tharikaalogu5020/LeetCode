class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int max=0;
        int c=0;
        for(int right=0;right<s.length();right++)
        {
          char r=s.charAt(right);
          if(vowel(r))
          {
            c++;
          }
            if(right-left+1==k)
            {
               
                max=Math.max(c,max);
                char ch=s.charAt(left);
                if(vowel(ch))
                {
                    c--;
                }
                left++;
            }
        }
        return max;
    }
    public static boolean vowel(char c)
    {
       
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;
        }
       
       return false;
    }
}