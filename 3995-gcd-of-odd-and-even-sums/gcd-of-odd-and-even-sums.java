class Solution {
    public int gcdOfOddEvenSums(int n) {
        int a=n;
        int evensum=a*(a+1);
        int oddsum=a*a;
        int max=Math.max(evensum,oddsum);
        int min=Math.min(evensum,oddsum);
        int val=gcdfinder(max,min);
        return val;
    }
    public int gcdfinder(int max,int min)
    {
       while(min!=0)
       {
        int rem=max%min;
        max=min;
        min=rem;
       
       }
       return max;
    }

}