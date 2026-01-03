class Solution {
public:
    int absDifference(vector<int>& nums, int k) {
        if(k>nums.size()) return 0;
        sort(nums.begin(),nums.end());
        int ans=0;
        for(int i=0;i<k;i++){
            ans+=nums[nums.size()-i-1]-nums[i];
        }
        return abs(ans);
    }
};