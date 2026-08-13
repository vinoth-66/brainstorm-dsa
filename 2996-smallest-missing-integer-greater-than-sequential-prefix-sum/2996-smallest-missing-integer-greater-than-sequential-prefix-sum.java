class Solution {
    public int missingInteger(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==nums[i-1]) ans+=nums[i];
            else break;
        }
        Set<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        while(true){
            if(!set.contains(ans)) return ans;
            ans++;
        }
    }
}