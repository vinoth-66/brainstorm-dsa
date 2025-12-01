class Solution {
public:
    int countElements(vector<int>& nums, int k) {
        if(k==0) return nums.size();
        sort(nums.begin(),nums.end());
        int ans=0;
        int last=nums[nums.size()-k];
        for(int i:nums){
            if(i<last) ans+=1;
        }
        return ans;
    }
};