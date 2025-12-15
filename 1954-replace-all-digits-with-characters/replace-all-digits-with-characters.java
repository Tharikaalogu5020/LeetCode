class Solution {
    public String replaceDigits(String s) {
        StringBuffer str=new StringBuffer();
        char previous=0;
        for(char c:s.toCharArray())
        {
            if(Character.isLetter(c))
            {
   str.append(c);
   previous=c;
            }
            else
            {
                str.append((char)((c-'0')+previous));
            }
        }
        return str.toString();
    }
}