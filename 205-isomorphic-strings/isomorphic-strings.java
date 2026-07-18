class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char c1=t.charAt(i);
            if(hm.containsKey(c))
            {
                if(hm.get(c).equals(c1)==false)
                {
                    return false;
                }
            }
            else
            {
                if(hm.containsValue(c1))
                {
                    return false;
                }
            }
            hm.put(c,c1);
        }
        return true;
    }
}