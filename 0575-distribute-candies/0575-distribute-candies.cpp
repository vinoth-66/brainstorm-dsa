class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        unordered_set<int> set;
        int n=candyType.size();
        for(int i=0;i<n;i++){
            if(set.size()>=n/2) break;
            set.insert(candyType[i]);
        }
        return set.size();
    }
};