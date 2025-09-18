class Solution {
public:
    int countSubarrays(vector<int>& nums) {
        if(nums.size()<3) return 0;
        int c=0;
        for(int i=1;i<nums.size()-1;i++){
            if(2*(nums[i-1]+nums[i+1])==nums[i]) c++;
        }
        return c;
    }
};