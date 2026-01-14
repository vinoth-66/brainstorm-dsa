class Solution {
public:
    int centeredSubarrays(vector<int>& nums) {
        int ans=0;
        unordered_set<int> set;
        for(int i=0;i<nums.size();i++){
            int s=0;
            set.clear();           
            for(int j=i;j<nums.size();j++){
                set.insert(nums[j]);
                s+=nums[j];
                if(set.find(s)!=set.end()) ans++;
            }
        }
        return ans;
    }
};