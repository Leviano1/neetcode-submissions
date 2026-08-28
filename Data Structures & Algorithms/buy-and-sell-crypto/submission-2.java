class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; // day 1
        int r = 1; //day 2
        int max = 0;
        int current = 0;

        while(r < prices.length){
            if(prices[l] > prices[r]){
                l = r;
            }
            current = prices[r] - prices[l];
            max = Math.max(max, current);
            r++;
        }
        return max;
    }
}
