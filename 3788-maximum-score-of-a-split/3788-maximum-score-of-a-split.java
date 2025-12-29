class Solution {
    public long maximumScore(int[] nums) {
        int[] arr=new int[nums.length];
        int min=nums[nums.length-1];
        arr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
            }
            arr[i]=min;
        }
        long ans=Integer.MIN_VALUE;
        long s=0;
        for(int i=0;i<nums.length-1;i++){
            s+=nums[i];
            if(s-arr[i+1]>ans) ans=s-arr[i+1];
        }
        return ans;
    }
}