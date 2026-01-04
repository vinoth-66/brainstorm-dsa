class Solution {
public:
    long long minCost(string s, vector<int>& cost) {
        vector<long long> arr(26);
        long long sum=0,m=-1;
        for(int i=0;i<s.size();i++){
            arr[s[i]-97]+=cost[i];
            sum+=cost[i];
            m=max(m,arr[s[i]-97]);
        }
        return sum-m;
    }
};