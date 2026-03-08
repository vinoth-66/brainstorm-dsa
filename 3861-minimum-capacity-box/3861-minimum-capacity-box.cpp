class Solution {
public:
    int minimumIndex(vector<int>& nums, int itemSize) {
        int ans=INT_MAX;
        int in=-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>itemSize && ans>nums[i]){
                ans=nums[i];
                in=i;
            }
            else if(nums[i]==itemSize) return i;
        }
        return in;
    }
};