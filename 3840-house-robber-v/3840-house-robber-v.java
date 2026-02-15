class Solution {
    public long rob(int[] nums, int[] colors) {
        long[][] memo=new long[nums.length][2];
        for(long[] i:memo) Arrays.fill(i,-1);
        return vin(nums,colors,0,0,memo);
    }
    private long vin(int[] nums,int[] col,int in,int prev,long[][] memo){
        if(in>=nums.length) return 0;
        if(memo[in][prev]!=-1) return memo[in][prev];
        boolean canp=false;
        if(prev==0) canp=true;
        else{
            if(col[in-1]!=col[in]) canp=true;
        }
        long dp=vin(nums,col,in+1,0,memo);
        if(canp){
            long p=nums[in]+vin(nums,col,in+1,1,memo);
            dp=Math.max(dp,p);
        }
        return memo[in][prev]=dp;
    }
}