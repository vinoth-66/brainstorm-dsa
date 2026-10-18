class Solution {
    public int minDeletions(int[] nums) {
        int l=0,r=0;
        int len=nums.length;
        int ans=0;
        while(r<len){
            while(r<len-1 && nums[r]==nums[r+1]){
                r++;
            }
            ans+=(r-l);
            r+=1;
            l=r;
        }
        return ans;
    }
}