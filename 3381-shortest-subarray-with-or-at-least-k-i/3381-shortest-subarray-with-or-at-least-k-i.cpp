class Solution {
public:
    int minimumSubarrayLength(vector<int>& nums, int k) {
        if(nums.size()<=0 || k<0) return -1;
        int ans=INT_MAX;
        for(int i=0;i<nums.size();i++){
            int v=0;
            for(int j=i;j<nums.size();j++){
                v|=nums[j];
                if(v>=k){
                    ans=min(ans,j-i+1);
                    break;
                }
            }
            
        }
        return ans==INT_MAX?-1:ans;
    }
};