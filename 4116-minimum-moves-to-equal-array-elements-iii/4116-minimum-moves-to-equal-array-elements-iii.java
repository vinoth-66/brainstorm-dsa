class Solution {
    public int minMoves(int[] nums) {
        if(nums.length<=1) return 0;
        int s=0;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i:nums){
            s+=max-i;
        }
        return s;
    }
}