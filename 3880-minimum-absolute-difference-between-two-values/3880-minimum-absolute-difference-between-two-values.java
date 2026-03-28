class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int in=-1,v=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1 || nums[i]==2){
                in=i;
                v=nums[i];
                break;
            }
        }
        if(in==-1) return -1;
        int ind=in;
        int ans=nums.length;
        for(int i=in+1;i<nums.length;i++){
            if(nums[i]==v){
                ind=i;
            }
            else if(nums[i]!=v && (nums[i]==1 || nums[i]==2)){
                ans=Math.min(i-ind,ans);
                v=nums[i];
                ind=i;
            }
        }
        if(ans==nums.length) return -1;
        return ans;
    }
}