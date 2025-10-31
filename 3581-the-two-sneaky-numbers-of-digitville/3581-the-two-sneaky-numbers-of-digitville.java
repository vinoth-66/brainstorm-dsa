class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        Arrays.sort(nums);
        int in=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) ans[in++]=nums[i];
        }
        return ans;
    }
}