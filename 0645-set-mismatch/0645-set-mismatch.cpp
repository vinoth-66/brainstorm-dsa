class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        set<int> set;
        vector<int> ans(2);
        for(int i:nums){
            if(set.find(i)!=set.end()){
                ans[0]=i;
            }
            set.insert(i);
        }
        for(int i=1;i<=nums.size();i++){
            if(set.find(i)==set.end()){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
};