class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> hs=new HashSet<>();
       
        while(n!=1)
        {
            if(hs.contains(n))
            {
                return false;
            }
            hs.add(n);
            int sq=0;
            while(n>0)
            {
                int rem=n%10;
                int squr=rem*rem;
                sq+=squr;
                n/=10;

            }
            n=sq;
        }
        return n==1?true:false;
    }
}