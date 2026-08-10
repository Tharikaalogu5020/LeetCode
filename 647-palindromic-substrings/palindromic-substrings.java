class Solution {
    public int countSubstrings(String s) {
        int c=0;
       for(int i=0;i<s.length();i++)
       {
         
         for(int j=i;j<s.length();j++)
         {
           String str=s.substring(i,j+1);
            if(pallin(str))
            {
                c++;
            }

         }
       }
       return c; 
    }
    public static boolean pallin(String s)
    {
        
        if(s.length()==1)
        {
           
           return true;
        }
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
               return false;
            }
            start++;
            end--;
        }
        return true;
    }
}