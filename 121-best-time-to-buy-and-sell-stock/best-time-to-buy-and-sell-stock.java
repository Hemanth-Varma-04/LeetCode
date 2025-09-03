class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprofit = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minprofit = Math.min(minprofit,prices[i]);
            maxprofit = Math.max(maxprofit,prices[i]-minprofit);
        }
        return maxprofit;
    }
}