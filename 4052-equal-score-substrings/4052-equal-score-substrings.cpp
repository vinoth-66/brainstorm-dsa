class Solution {
public:
    bool scoreBalance(string s) {
        if(s.size()<2) return false;
        else{
            int f=0;
            for(int i=0;i<s.size()-1;i++) f+=s[i]-96;
            int l=s[s.size()-1]-96;
            for(int i=s.size()-2;i>=0;i--){
                if(f==l) return true;
                else{
                    f-=s[i]-96;
                    l+=s[i]-96;
                }
            }
            return false;
        }
    }
};