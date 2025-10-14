class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for(int i=0;i+2*k<=nums.size();i++){
            if(fun(i,k,nums) && fun(i+k,k,nums)) return true;
        }
        
        return false;
    }
    private boolean fun(int s,int e,List<Integer> nums){
        for(int i=s;i<s+e-1;i++){
            if(nums.get(i)>=nums.get(i+1)) return false; 
        }
        return true;
    }
}