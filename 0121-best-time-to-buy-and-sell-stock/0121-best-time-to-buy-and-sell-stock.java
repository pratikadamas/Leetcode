class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int max_profit = 0;
        int buy_price = prices[0];

        for(int i = 1; i < n; i++)
        {
            if(prices[i] < buy_price)
            {
                buy_price = prices[i];
            }
            else 
            {
                int curr = prices[i] - buy_price;
                max_profit = Math.max(max_profit, curr);
            }
        } // End of for loop
        
        return max_profit; // Return statement moved outside the loop
        
    }
} 