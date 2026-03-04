class Solution {
    public String largestGoodInteger(String num) {
        String res="";
        for(int i=0;i<num.length()-2;i++)
        {
            char ch=num.charAt(i);
            if(ch==num.charAt(i+1)&& ch==num.charAt(i+2))
            {
               String temp=num.substring(i,i+3); 
               if(res.compareTo(temp)<0)
               {
                res=temp;
               }
            }
        }
        return res;
    }
}