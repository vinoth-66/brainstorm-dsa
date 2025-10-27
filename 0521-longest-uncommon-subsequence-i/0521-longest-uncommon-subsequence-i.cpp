class Solution {
public:
    int findLUSlength(string a, string b) {
        if(a==b) return -1;
        else if(b.size()>a.size()) return b.size();
        return a.size();
    }
};