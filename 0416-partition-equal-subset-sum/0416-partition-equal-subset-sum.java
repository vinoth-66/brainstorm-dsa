class Solution {
    public boolean canPartition(int[] nums) {
        int tar=0;
        for(int i:nums) tar+=i;
        if(tar%2!=0) return false;
        Boolean[][] memo=new Boolean[nums.length][tar+1];
        return subset(nums,0,tar/2,memo);
    }
    private boolean subset(int[] nums,int in,int tar,Boolean[][] memo){
        if(tar==0) return true;
        if(tar<0) return false;
        if(in>nums.length-1) return false;
        if(memo[in][tar]!=null) return memo[in][tar];
        boolean pick=subset(nums,in+1,tar-nums[in],memo);
        boolean leave=subset(nums,in+1,tar,memo);
        return memo[in][tar]=pick||leave;
    }
}