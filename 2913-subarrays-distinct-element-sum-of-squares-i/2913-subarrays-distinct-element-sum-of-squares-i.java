class Solution {
    public int sumCounts(List<Integer> nums) {
        int len=nums.size();
        int ans=0;
        for(int i=0;i<len;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i;j<len;j++){
                set.add(nums.get(j));
                int s=set.size();
                ans+=(s*s);
            }
        }
        return ans;
    }
}