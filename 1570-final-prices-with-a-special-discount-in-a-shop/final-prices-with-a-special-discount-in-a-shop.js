/**
 * @param {number[]} prices
 * @return {number[]}
 */
var finalPrices = function(prices) {
      let res=[...prices];
        for(let i=0;i<prices.length;i++)
        {
            for(let j=i+1;j<prices.length;j++)
            {
                if(prices[i]>=prices[j])
                {
                    res[i]=prices[i]-prices[j];
                    break;
                }
                else
                {
                     res[i]=prices[i];
                }
            }
        }
        res[res.length-1]=prices[prices.length-1];
        return res;
};