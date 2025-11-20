class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int s1=-1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ans+=i;
                s1=1;
            }
            else if(nums[i]==nums.length){
                if(s1==-1){
                    ans+=nums.length-2-i;
                }
                else ans+=nums.length-1-i;
            }
        }
        return ans;
    }
}