class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int ts = 0;
        for (int num : nums) ts += num;
        if(ts<Math.abs(target)) return 0;
        int[][] memo=new int[nums.length][2*ts+1];
        for(int[] i:memo) Arrays.fill(i,Integer.MIN_VALUE);
        return fun(nums,0,target,0,ts,memo);
    }
    private int fun(int[] nums,int in,int t,int s,int ts,int[][] memo){
        if(in==nums.length){
            if(t==s) return 1;
            return 0;
        }
        int dynamicSum=ts+s;
        if(memo[in][dynamicSum]!=Integer.MIN_VALUE) return memo[in][dynamicSum];
        int a=fun(nums,in+1,t,s-nums[in],ts,memo);
        int b=fun(nums,in+1,t,s+nums[in],ts,memo);
        memo[in][dynamicSum]=a+b;
        return memo[in][dynamicSum];
    }
}