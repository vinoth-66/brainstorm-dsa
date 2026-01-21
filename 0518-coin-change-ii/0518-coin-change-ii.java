class Solution {
    public int change(int amount, int[] coins) {
        int[][] memo=new int[coins.length][amount+1];
        for(int[] i:memo) Arrays.fill(i,-1);
        return fun(coins,amount,0,memo);
    }
    private int fun(int[] coins,int amt,int in,int[][] memo){
        if(amt==0) return 1;
        else if(amt<0) return 0;
        if(in==coins.length) return 0;
        if(memo[in][amt]!=-1) return memo[in][amt];
        int l=fun(coins,amt,in+1,memo);
        if(amt-coins[in]>=0){
            int p=fun(coins,amt-coins[in],in,memo);
            l+=p;
        }
        memo[in][amt]=l;
        return l;
    }
}