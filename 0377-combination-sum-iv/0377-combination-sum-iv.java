class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[][] memo=new int[nums.length][target+1];
        for(int[] i:memo) Arrays.fill(i,-1);
        return fun(nums,target,0,memo);
    }
    private int fun(int[] arr,int t,int in,int[][] memo){
        if(t==0) return 1;
        else if(t<0) return 0;
        if(in==arr.length) return 0;
        if(memo[in][t]!=-1) return memo[in][t];
        int l=fun(arr,t,in+1,memo);
        if(t-arr[in]>=0){
            int p=fun(arr,t-arr[in],0,memo);
            l+=p;
        }
        memo[in][t]=l;
        return l;
    }
}