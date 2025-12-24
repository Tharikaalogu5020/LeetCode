class Solution {
    public String convertToBase7(int num) {
    //     int sum=0;
    //     if(num==0) return "0";
    //    StringBuffer sb=new StringBuffer();
    //    boolean n=false;
    //    if(num<0)
    //     n=true;
    //     num=Math.abs(num);
    //    while(num!=0)
    //    {
    //     sb.append(num%7);
    //     num/=7;
    //    } 
    //    sb.reverse();
    //    sb.toString();
    //    return (n?"-"+sb:sb).toString();
    return Integer.toString(num,7);
    }
}