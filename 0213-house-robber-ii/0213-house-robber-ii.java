class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] memo=new int[nums.length];
        Arrays.fill(memo,-1);
        int v1=vin(0,nums,nums.length-1,memo);
        Arrays.fill(memo,-1);
        int v2=vin(1,nums,nums.length,memo);
        return Math.max(v1,v2);
    }
    public int vin(int in,int[] nums,int len,int[] memo){
        if(in==len-1) return nums[in];
        else if(in>=len) return 0;
        if(memo[in]!=-1) return memo[in];
        int p=nums[in]+vin(in+2,nums,len,memo);
        int l=vin(in+1,nums,len,memo);
        return memo[in]=Math.max(p,l);
    }
}