class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        if(nums.length<=0 || k<0) return -1;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int v=0;
            for(int j=i;j<nums.length;j++){
                v|=nums[j];
                if(v>=k){
                    ans=Math.min(ans,j-i+1);
                    break;
                }
            }
            
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}