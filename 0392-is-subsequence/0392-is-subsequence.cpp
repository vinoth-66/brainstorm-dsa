class Solution {
public:
    bool isSubsequence(string s, string t) {
        int ind=-1;
        for(char c:s){
            ind=t.find(c,ind+1);
            if(ind==string::npos) return false;
        }
        return true;
    }
};