class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double ans=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int priceLen=prices.length-1;
        int discountsLen=discounts.length-1;
        int len=Math.min(priceLen,discountsLen);
        for(int i=len;i>=0;i--){
            ans+=((prices[priceLen--]*(100.0-discounts[discountsLen--]))/100.0);
        }
        if(priceLen!=-1){
            for(int i=0;i<=priceLen;i++){
                ans+=prices[i];
            }
        }
        return ans;
    }
}