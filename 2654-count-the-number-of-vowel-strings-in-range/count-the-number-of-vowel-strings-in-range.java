class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++)
        {
            char sr=words[i].charAt(0);
            char l=words[i].charAt(words[i].length()-1);
            if(find(sr,l))
            {
                c++;
            }
        }
        return c;
    }
    public boolean find(char s,char st)
    {
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
        {
            if(st=='a'||st=='e'||st=='i'||st=='o'||st=='u')
            {
                return true;
            }
        }
        return false;
    }
}