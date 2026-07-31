class Solution {
    public String longestNiceSubstring(String s) {
        String ans="";
       for(int i=0;i<s.length();i++)
       {
      //  String res="";
        for(int j=i+1;j<=s.length();j++)
        {
          String res=s.substring(i,j);
            if(istrue(res)&& res.length() > ans.length())
            {
              ans=res;
            }
        }
       }
       return ans; 
    }
    public boolean istrue(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!s.contains(Character.toString(Character.toUpperCase(c)))|| !s.contains(Character.toString(Character.toLowerCase(c))))
            {
                return false;
            }
        }
        return true;
    }
}