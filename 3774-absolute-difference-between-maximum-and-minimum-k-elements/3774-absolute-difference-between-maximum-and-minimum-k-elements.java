class Solution {
    public int absDifference(int[] nums, int k) {
        if(k>nums.length) return 0;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<k;i++){
            ans+=nums[nums.length-i-1]-nums[i];
        }
        return Math.abs(ans);
    }
}