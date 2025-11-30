class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] memo=new int[nums.length][nums.length+1];
        for(int[] row:memo) Arrays.fill(row,-1);
        return lis(nums,0,-1,memo);
    }
    private int lis(int[] nums,int in,int pre,int[][] memo){
        if(in>nums.length-1) return 0;
        if(memo[in][pre+1]!=-1) return memo[in][pre+1];

        int pick=0;
        if(pre==-1 || nums[in]>nums[pre]){
            pick=1+lis(nums,in+1,in,memo);
        }

        int leave=lis(nums,in+1,pre,memo);

        return memo[in][pre+1]=Math.max(pick,leave);
    }
}