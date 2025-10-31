class Solution {
public:
    vector<int> getSneakyNumbers(vector<int>& nums) {
        vector<int> ans(2);
        sort(nums.begin(),nums.end());
        int in=0;
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]==nums[i+1]) ans[in++]=nums[i];
        }
        return ans;
    }
};