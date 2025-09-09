class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> ans(nums.size());
        int v=0,h=1;
        for(int i:nums){
            if(i<0){
                ans[h]=i;
                h+=2;
            }
            else{
                ans[v]=i;
                v+=2;
            }
        }
        return ans;
    }
};