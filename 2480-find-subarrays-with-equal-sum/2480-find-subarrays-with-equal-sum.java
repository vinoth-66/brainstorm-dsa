class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> check=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int sum=nums[i]+nums[i+1];
            if(check.contains(sum)) return true;
            check.add(sum);
        }
        return false;
    }
}