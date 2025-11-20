class Solution {
public:
    int minimizedStringLength(string s) {
        unordered_set<char> set;
        for(int i=0;i<s.size();i++){
            set.insert(s[i]);
        }
        return set.size();
    }
};