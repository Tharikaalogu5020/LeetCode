class Solution {
    public String addBinary(String a, String b) {
       int i=a.length()-1;
       int j=b.length()-1;
       int carry=0;
       StringBuffer sb=new StringBuffer();
       while(i>=0||j>=0||carry!=0)
       {
          int d1=i>=0?a.charAt(i)-'0':0;
          int d2=j>=0?b.charAt(j)-'0':0;
          int sum=d1+d2+carry;
          carry=sum/2;
          sb.append(sum%2);
          i--;
          j--;
       }
       return sb.reverse().toString();
    }
}