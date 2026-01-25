class Solution {
    public int rob(int[] nums) {
        int[] memo=new int[nums.length+1];
        Arrays.fill(memo,-1);
        return vin(nums,0,memo);
    }
    private int vin(int[] arr,int in,int[] memo){
        if(in>=arr.length) return 0;
        if(memo[in]!=-1) return memo[in];
        int a=arr[in]+vin(arr,in+2,memo);
        int b=vin(arr,in+1,memo);
        return memo[in]=Math.max(a,b);
    }
}