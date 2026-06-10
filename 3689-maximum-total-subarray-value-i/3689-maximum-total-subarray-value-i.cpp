class Solution {
public:
    long long maxTotalValue(vector<int>& nums, int k) {
        long long mini=INT_MAX;
        long long maxi=INT_MIN;
        for(int i:nums){
            mini=min(mini,(long long)i);
            maxi=max(maxi,(long long)i);
        }
        return (maxi-mini)*(k);
    }
};