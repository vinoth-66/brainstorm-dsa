class Solution {
public:
    bool reportSpam(vector<string>& message, vector<string>& bannedWords) {
        unordered_set<string> set;
        for(const string& s: bannedWords){
            set.insert(s);
        }
        int c=0;
        for(string const& s:message){
            if(set.find(s)!=set.end()) c++;
            if(c==2) return true;
        }
        return false;
    }
};