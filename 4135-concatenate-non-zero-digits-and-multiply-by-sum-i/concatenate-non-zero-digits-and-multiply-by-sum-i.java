class Solution {
    public long sumAndMultiply(int n) {
        String num=Integer.toString(n);
        long original=0;
        long sum=0;
    for(int i=0;i<num.length();i++)
       {
          long d=num.charAt(i)-'0';
          if(d!=0)
          {
            original=original*10+d;
            sum+=d;
          }
       }
       
    return original*sum;
    }
}