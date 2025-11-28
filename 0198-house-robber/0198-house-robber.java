class Solution {
    public int rob(int[] nums) {
        int[] memo=new int[nums.length];
        Arrays.fill(memo,-1);
        return(subset(nums,memo,0));
    }
    private int subset(int[] nums,int[] memo,int in){
        if(in>nums.length-1) return 0;
        if(memo[in]!=-1) return memo[in];
        int pick=nums[in]+subset(nums,memo,in+2);
        int leave=subset(nums,memo,in+1);

        return memo[in]=Math.max(pick,leave);
    }
}