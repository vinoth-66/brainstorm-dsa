class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int mi=nums[0];
        int ma=-1;
        for(int i=1;i<nums.size();i++){
            if(nums[i]>mi) ma=max(ma,nums[i]-mi);
            else mi=min(mi,nums[i]);
        }
        return ma;
    }
};