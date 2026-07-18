class Solution {
    public boolean wordPattern(String pattern, String s) {
     
        Map<Character,String> m=new HashMap<>();
        String[] str=s.split(" ");
        if(pattern.length()!=str.length)
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            if(m.containsKey(c))
            {
                if(m.get(c).equals(str[i])==false)
                {
                    return false;
                }
            }
            else{
            if(m.containsValue(str[i]))
            {
                return false;
            }
            
             m.put(c,str[i]);
            }
        }
        return true;
    }
}