class Solution {
    public int maxProfit(int[] prices) {
       int minValue=Integer.MAX_VALUE;
       int maxprofit=0;
       for(int i=0;i<prices.length;i++)
       {
         if(prices[i]<minValue)
         {
            minValue=prices[i];
         }
         if(prices[i]-minValue>maxprofit)
         {
            maxprofit=prices[i]-minValue;
         }
       } 
       return maxprofit;
    }
}