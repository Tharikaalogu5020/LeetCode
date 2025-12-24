class Solution {
    public int sumBase(int n, int k) {
        StringBuffer sb=new StringBuffer();
        while(n!=0)
        {
           sb.append(n%k);
           n/=k;
        }
        sb.reverse();
        String s=sb.toString();
        System.out.print(s);
        int res=Integer.parseInt(s);
      int sum=0;
      while(res!=0)
      {
           sum+=res%10;
           res/=10;
      }
      System.out.print(sum);
      return sum;
    }
}