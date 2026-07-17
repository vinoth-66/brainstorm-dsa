class Solution {
    public int rob(int[] nums) {
        int[] memo=new int[nums.length];
        Arrays.fill(memo,-1);
        return vin(0,nums,memo);
    }
    public int vin(int in,int[] nums,int[] memo){
        if(in==nums.length-1){
            return nums[in];
        }
        else if(in>=nums.length) return 0;
        if(memo[in]!=-1) return memo[in];
        int p=nums[in]+vin(in+2,nums,memo);
        int l=vin(in+1,nums,memo);
        return memo[in]=Math.max(p,l);
    }
}