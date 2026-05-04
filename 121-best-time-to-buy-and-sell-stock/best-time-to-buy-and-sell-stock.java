class Solution {
    public int maxProfit(int[] prices) {
       int minValue=Integer.MAX_VALUE;
       int maxprofit=0;
       int profit=0;
       for(int i=0;i<prices.length;i++)
       {
         if(prices[i]<minValue)
         {
            minValue=prices[i];
         }
         profit=prices[i]-minValue;
         if(profit>maxprofit)
         {
            maxprofit=profit;
         }
       } 
       return maxprofit;
    }
}