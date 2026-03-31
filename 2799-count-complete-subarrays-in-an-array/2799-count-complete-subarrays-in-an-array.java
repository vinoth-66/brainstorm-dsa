class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i:nums) set.add(i);
        if(set.size()==1) return n*(n+1)/2;
        int i=0,j=0;
        HashMap<Integer,Integer> inner=new HashMap<>();
        int ans=0;
        while(j<n){
            inner.put(nums[j],inner.getOrDefault(nums[j],0)+1);
            while(set.size()==inner.size()){
                inner.put(nums[i],inner.getOrDefault(nums[i],0)-1);
                if(inner.get(nums[i])==0) inner.remove(nums[i]);
                ans+=(n-j);
                i++;
            }
            j++;
        }
        return ans;
    }
}