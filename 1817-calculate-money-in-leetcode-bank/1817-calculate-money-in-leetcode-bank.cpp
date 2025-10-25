class Solution {
public:
    int totalMoney(int n) {
        int ans=0;
        int s=1;
        int e=7;
        int in=1;
        for(int i=0;i<n;i++){
            if(in==e){
                s+=1;
                in=s;
                ans+=e;
                e+=1;
            }
            else{
                ans+=in;
                in+=1;
            }
        }
        return ans;
    }
};