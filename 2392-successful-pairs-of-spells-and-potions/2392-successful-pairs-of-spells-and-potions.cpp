class Solution {
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        vector<int> ans(spells.size());
        sort(potions.begin(),potions.end());
        for(int i=0;i<spells.size();i++){
            calc(spells[i],potions,ans,success,i);
        }
        return ans;
    }
    private:
        void calc(int mul,vector<int>& potions,vector<int>& ans,long long success,int in){
            int s=0,e=potions.size()-1;
            while(s<=e){
                int mid=(s+e)/2;
                long long product = 1LL * mul * potions[mid];
                if(product>=success) e=mid-1;
                else s=mid+1;
            }
            ans[in]=potions.size()-s;
        }
};