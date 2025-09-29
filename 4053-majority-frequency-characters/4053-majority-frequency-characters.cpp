class Solution {
public:
    string majorityFrequencyGroup(string s) {
        vector<int> ans(26,0);
        for(int i=0;i<s.size();i++){
            ans[s[i]-97]++;
        }
        vector<int> alpha=ans;
        sort(alpha.begin(),alpha.end());
        int c=1;
        int max=0;
        int maxfreq=0;
        for(int i=0;i<alpha.size()-1;i++){
            if(alpha[i]==0) continue;
            if(alpha[i]==alpha[i+1]) c++;
            else{
                if(max<=c){
                    max=c;
                    maxfreq=alpha[i];
                }
                c=1;
            }
        }
        if(max<=c){
            max=c;
            maxfreq=alpha[alpha.size()-1];
        }
        string v="";
        for(int i=0;i<ans.size();i++){
            if(ans[i]==maxfreq) v+=(char)(i+97);
        }
        return v;
    }
};