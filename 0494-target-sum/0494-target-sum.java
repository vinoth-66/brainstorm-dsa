class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[] ans=new int[1];
        fun(nums,0,target,0,ans);
        return ans[0];
    }
    private void fun(int[] nums,int in,int t,int s,int[] ans){
        if(in==nums.length){
            if(t==s) ans[0]+=1;
            return;
        }
        fun(nums,in+1,t,s-nums[in],ans);
        fun(nums,in+1,t,s+nums[in],ans);
    }
}