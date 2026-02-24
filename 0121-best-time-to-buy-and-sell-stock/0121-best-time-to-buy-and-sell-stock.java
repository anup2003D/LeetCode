class Solution {
    public int maxProfit(int[] prices) {
        

        int ans=0;
        int min_elem=prices[0];
        for(int i = 1; i < prices.length; i++){
            min_elem = Math.min(min_elem, prices[i]);
            int profit = prices[i] - min_elem;

            ans = Math.max(ans, profit);
        }
        return ans;
    }
}