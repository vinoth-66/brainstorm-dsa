class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] memo=new int[coins.length][amount+1];
        for(int[] arr:memo) Arrays.fill(arr,-1);
        int check=subset(coins,memo,amount,0);
        if(check>=1000000) return -1;
        return check;
    }
    private int subset(int[] coins,int[][] memo,int amt,int in){
        if(amt==0) return 0;
        if(amt<0) return 1000000;
        if(in>coins.length-1) return 1000000;
        if(memo[in][amt]!=-1) return memo[in][amt];
        int pick=1+subset(coins,memo,amt-coins[in],in);
        int leave=subset(coins,memo,amt,in+1);

        return memo[in][amt]=Math.min(pick,leave);
    }
}