class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        unordered_set<int> set;
        for(int i=0;i<nums.size();i++){
            set.insert(nums[i]);
            if(set.size()!=i+1) return nums[i];
        }
        return 0;
    }
};