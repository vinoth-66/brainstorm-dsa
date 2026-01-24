class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int s=0,e=nums.length-1;
        int max=-1;
        while(s<e){
            max=Math.max(max,nums[s]+nums[e]);
            s++;
            e--;
        }
        return max;
    }
}