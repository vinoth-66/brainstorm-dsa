class Solution {
public:
    int binaryGap(int n) {
        string s = bitset<32>(n).to_string();
        int count=0,ans=0,f=0;
        for(int i=0;i<s.size();i++){
            if(s[i]=='1' && f==0) f=1;
            else if(s[i]=='1' && f==1){
                ans=max(count,ans);
                f=1;
                count=0;
            }
            if(f==1) count++;
        }
        return ans;
    }
};