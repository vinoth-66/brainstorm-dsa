class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l=nums.length;
        int[] ans=new int[l];
        int ls=0;
        int s=0;
        for(int i:nums) s+=i;
        int rs=s;
        for(int i=0;i<l;i++){
            rs-=nums[i];
            ans[i]=Math.abs(ls-rs);
            ls+=nums[i];
        }
        return ans;
    }
}