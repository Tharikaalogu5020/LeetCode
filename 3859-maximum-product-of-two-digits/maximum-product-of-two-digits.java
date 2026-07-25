class Solution {
    public int maxProduct(int n) {
       String str=Integer.toString(n);
       String s[]=str.split("");
int max=Integer.MIN_VALUE;
       int n1=s.length;
      // int k=2;
       for(int i=0;i<n1;i++)
       {
        int pro=1;
        for(int j=i+1;j<n1;j++)
        {
            pro=Integer.parseInt(s[j])* Integer.parseInt(s[i]);
        
            max=Math.max(max,pro);
        }
        
       }
       return max;
    }
}