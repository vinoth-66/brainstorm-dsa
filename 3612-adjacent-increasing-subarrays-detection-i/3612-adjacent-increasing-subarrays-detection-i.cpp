class Solution {
public:
    bool hasIncreasingSubarrays(vector<int>& nums, int k) {
        for(int i=0;i+2*k<=nums.size();i++){
            if(fun(i,k,nums) && fun(i+k,k,nums)) return true;
        }
        return false;
    }
private:
    bool fun(int s,int e,vector<int>& nums){
        for(int i=s;i<s+e-1;i++){
            if(nums[i]>=nums[i+1]) return false; 
        }
        return true;
    }
};