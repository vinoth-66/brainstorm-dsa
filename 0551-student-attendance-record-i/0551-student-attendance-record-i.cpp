class Solution {
public:
    bool checkRecord(string s) {
        int ac=0;
        int lc=0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='A'){
                ac+=1;
                lc=0;
            }
            else if(s[i]=='P') lc=0;
            else if(s[i]=='L'){
                lc+=1;
            }
            if(lc==3) return false; 
        }
        if(ac<2) return true;
        return false;
    }
};