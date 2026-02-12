class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            freq[magazine.charAt(i)-'a']++;
        }
        for(char c:ransomNote.toCharArray())
        {
            if(freq[c-'a']==0)
            {
                return false;
            }
            freq[c-'a']--;
        }
        return true;
    }
}