class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
     Arrays.sort(happiness);
    long val=0;
     long sum=0;
     for(int i=0;i<k;i++)
     {
       long last=happiness[happiness.length-i-1];
       last-=val;
       if(last<=0) break;
       sum+=last;

val++;
    }
    return sum;
}
}