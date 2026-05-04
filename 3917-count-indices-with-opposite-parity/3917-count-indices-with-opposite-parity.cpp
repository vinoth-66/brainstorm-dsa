class Solution {
public:
    vector<int> countOppositeParity(vector<int>& nums) {
        int e=0,o=0;
        int l=nums.size();
        vector<int> ans(l);
        for(int i=l-1;i>=0;i--){
            if(nums[i]%2==0){
                ans[i]=o;
                e++;
            }
            else{
                ans[i]=e;
                o++;
            }
        }
        return ans;
    }
};