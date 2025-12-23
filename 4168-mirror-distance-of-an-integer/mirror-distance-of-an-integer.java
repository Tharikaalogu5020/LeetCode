class Solution {
    public int mirrorDistance(int n) {
        String str=Integer.toString(n);
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
       int num=Integer.parseInt(sb.toString());
       int res=Math.abs(n-num);
       return res;
    }
}