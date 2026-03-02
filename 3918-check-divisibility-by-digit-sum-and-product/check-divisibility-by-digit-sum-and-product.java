class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int m=1;
        int dum=n;
        while(n!=0)
        {
            s+=n%10;
            m*=n%10;
            n/=10;
        }
        return dum%(s+m)==0;
    }
}