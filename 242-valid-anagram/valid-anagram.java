class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[] feq=new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            feq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            feq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<feq.length;i++)
        {
           if( feq[i]!=0)
           {
            return false;
           }
        }
        return true;
    }
}