class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0;
        int s=0,ans=Integer.MAX_VALUE;
        while(j<nums.length){
            s+=nums[j];
            while(s>target){
                ans=Math.min(ans,j-i+1);
                s-=nums[i];
                i++;
            }
            if(s==target) ans=Math.min(ans,j-i+1);
            j++;
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}