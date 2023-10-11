class Solution {
    public int maxProfit(int[] prices) {
        int firstbuy=Integer.MIN_VALUE;
        int firstsell=0;
        int secondbuy=Integer.MIN_VALUE;
        int secondsell=0;
        for(int i=0;i<prices.length;i++)
        {
            firstbuy=Math.max(firstbuy,-prices[i]);
            firstsell=Math.max(firstsell,firstbuy+prices[i]);
            secondbuy=Math.max(secondbuy,firstsell-prices[i]);
            secondsell=Math.max(secondsell,secondbuy+prices[i]);
        }
        return secondsell;
    }
}