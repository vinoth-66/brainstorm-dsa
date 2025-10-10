class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char,int> map;
        for(char c:s) map[c]++;
        int ans=0;
        int found=0;
        for(auto& m:map){
            ans+=m.second/2 * 2;
            if(m.second%2==1) found=1;
        }
        if(found) ans+=1;
        return ans;
    }
};