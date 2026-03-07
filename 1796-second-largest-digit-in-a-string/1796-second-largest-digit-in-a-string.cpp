class Solution {
public:
    int secondHighest(string s) {
        int m=INT_MIN;
        int sm=-1;
        for(int i=0;i<s.size();i++){
            if(s[i]-'0'>=0 && s[i]-'0'<10){
                int v=s[i]-'0';
                if(m<v){
                    sm=m;
                    m=v;
                }
                else if(v<m && v>sm) sm=v;
            }
        }
        if(sm==INT_MIN) return -1;
        return sm;
    }
};