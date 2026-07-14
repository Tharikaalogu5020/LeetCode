class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(!isvowel(c[l]))
            {
                l++;
            }
            else if(!isvowel(c[r]))
            {
                r--;
            }
            else
            {
                char temp=c[l];
                c[l]=c[r];
                c[r]=temp;
                l++;
                r--;
            }
        }
        return String.valueOf(c);
    }
    public static boolean isvowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        return false;
    }
}