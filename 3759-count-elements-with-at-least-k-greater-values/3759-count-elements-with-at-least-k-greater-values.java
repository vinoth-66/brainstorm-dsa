class Solution {
    public int countElements(int[] nums, int k) {
        if(k==0) return nums.length;
        Arrays.sort(nums);
        int ans=0;
        int last=nums[nums.length-k];
        for(int i:nums){
            if(i<last) ans+=1;
        }
        return ans;
    }
}