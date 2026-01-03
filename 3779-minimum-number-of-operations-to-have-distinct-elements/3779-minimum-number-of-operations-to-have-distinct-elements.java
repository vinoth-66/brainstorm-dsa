class Solution {
    public int minOperations(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int in=-1;
        for(int i=nums.length-1;i>=0;i--){
            if(set.contains(nums[i])){
                in=i;
                break;
            }
            set.add(nums[i]);
        }
        if(in==-1) return 0;
        return (in+3)/3;
    }
}