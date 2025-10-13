class Solution {
public:
    vector<string> removeAnagrams(vector<string>& words) {
        vector<string> ans;
        string prev="";
        for(string s:words){
            string srt=s;
            sort(srt.begin(),srt.end());
            if(srt!=prev){
                ans.push_back(s);
                prev=srt;
            }
        }
        return ans;
    }
};