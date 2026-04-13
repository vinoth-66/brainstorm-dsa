class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=Integer.MAX_VALUE;
        int in=start,len=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[in%len]==target) ans=Math.min(ans,Math.abs(in%len-start));
            in++;
        }
        return ans;
    }
}