class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] arr1=Arrays.copyOfRange(nums,0,nums.length-1);
        int[] arr2=Arrays.copyOfRange(nums,1,nums.length);
        int[] memo=new int[nums.length+1];
        Arrays.fill(memo,-1);
        int[] memo2=new int[nums.length+1];
        Arrays.fill(memo2,-1);
        return Math.max(vin(arr1,0,memo),vin(arr2,0,memo2));
    }
    private int vin(int[] arr,int in,int[] memo){
        if(in>arr.length-1) return 0;

        if(memo[in]!=-1) return memo[in];

        int a=arr[in]+vin(arr,in+2,memo);
        int b=vin(arr,in+1,memo);

        return memo[in]=Math.max(a,b);
 
    }
}