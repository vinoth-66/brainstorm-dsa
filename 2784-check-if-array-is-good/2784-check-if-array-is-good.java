class Solution {
    public boolean isGood(int[] nums) {
        int m=nums[0];
        for(int i=1;i<nums.length;i++) m=Math.max(m,nums[i]);
        int[] arr=new int[m+1];
        arr[m]=m;
        for(int i=1;i<=m;i++){
            arr[i-1]=i;
        }
        Arrays.sort(nums);
        return Arrays.equals(nums,arr);
    }
}