class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetter(c))
            {
                     s1.push(c);
             }
             else
             {
                if(!s1.isEmpty())
                {
                s1.pop();
                }
             }
        }
        String res="";
        while(!s1.isEmpty())
        {
      
  
    String f2=String.valueOf(s1.pop());
    res=f2+res;
        }
        Stack<Character> s2=new Stack<>();
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            if(Character.isLetter(c))
            {
                s2.push(c);
            }
            else
            {
                if(!s2.isEmpty())
                {
                s2.pop();
                }
            }
        }
        String res1="";
        while(!s2.isEmpty())
        {
  
        String ff2=String.valueOf(s2.pop());
        res1=ff2+res1;
        }
        if(res.equals(res1)) 
        {
            return true;
        }        
        return false;
        
    }
}