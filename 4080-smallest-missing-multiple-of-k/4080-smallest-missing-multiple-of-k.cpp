class Solution {
public:
    int missingMultiple(vector<int>& nums, int k) {
        set<int> set;
        int m=0;
        for(int i:nums){
            set.insert(i);
            if(i%k==0) m=max(m,i);
        }
        for(int i=k;i<=m;i+=k){
            if(set.find(i) == set.end()) return i;
        }
        if(m<k) return k; 
        return m+k;
    }
};