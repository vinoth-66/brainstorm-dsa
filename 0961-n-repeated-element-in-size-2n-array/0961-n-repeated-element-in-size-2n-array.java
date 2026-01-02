class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(set.size()!=i+1) return nums[i];
        }
        return 1;
    }
}