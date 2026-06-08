class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        vector<int> ans(nums.size());
        int in=0;
        for(int i:nums){
            if(i<pivot) ans[in++]=i;
        }
        for(int i:nums){
            if(i==pivot) ans[in++]=i;
        }
        for(int i:nums){
            if(i>pivot) ans[in++]=i;
        }
        return ans;
    }
};