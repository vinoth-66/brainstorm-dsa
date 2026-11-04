class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int mid=nums[len/2];
        int ans=0;
        for(int i:nums){
            if(i<mid) ans+=(mid-i);
            else if(i>mid) ans+=(i-mid);
        }
        return ans;
    }
}