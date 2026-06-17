class Solution {
    public int[] divisibilityArray(String word, int m) {
        
       int length=word.length();
       int[] res=new int[length];
       long rem=0;
       for(int i=0;i<length;i++)
       {
            rem=(rem*10+(word.charAt(i)-'0'))%m;
        
        if(rem==0)
        {
            res[i]=1;
        }
        else
        {
            res[i]=0;
        }
       }
       return res; 
    }
}