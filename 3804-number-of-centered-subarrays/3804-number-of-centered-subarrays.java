class Solution {
    public int centeredSubarrays(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int s=0;
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                set.add(nums[j]);
                s+=nums[j];
                if(set.contains(s)) ans++;
            }
        }
        return ans;
    }
}