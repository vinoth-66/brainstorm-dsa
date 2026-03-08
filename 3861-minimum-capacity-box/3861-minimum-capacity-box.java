class Solution {
    public int minimumIndex(int[] nums, int itemSize) {
        int ans=Integer.MAX_VALUE;
        int in=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>itemSize && ans>nums[i]){
                ans=nums[i];
                in=i;
            }
            else if(nums[i]==itemSize) return i;
        }
        return in;
    }
}