class Solution {
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int i:nums) s+=i;
        if(s%2!=0) return false;
        Boolean[][] memo=new Boolean[nums.length][s/2+1];
        for(Boolean i[]:memo) Arrays.fill(i,null);
        return fun(nums,0,s/2,memo);
    }
    private boolean fun(int[] nums,int in,int s,Boolean[][] memo){
        if(s==0) return true;
        else if(s<0) return false;
        if(in==nums.length) return false;
        if(memo[in][s]!=null) return memo[in][s]; 
        boolean p=fun(nums,in+1,s-nums[in],memo);
        boolean l=fun(nums,in+1,s,memo);
        memo[in][s]=p||l;
        return memo[in][s];
    }
}