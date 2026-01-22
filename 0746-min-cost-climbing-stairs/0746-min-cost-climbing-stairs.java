class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] memo=new int[cost.length];
        Arrays.fill(memo,-1);
        return Math.min(fun(cost,cost.length-1,memo),fun(cost,cost.length-2,memo));
    }
    private int fun(int[] cost,int in,int[] memo){
        if(in<0) return 0;
        if(memo[in]!=-1) return memo[in];
        int a=cost[in]+fun(cost,in-1,memo);
        int b=cost[in]+fun(cost,in-2,memo);
        return memo[in]=Math.min(a,b);
    }
}