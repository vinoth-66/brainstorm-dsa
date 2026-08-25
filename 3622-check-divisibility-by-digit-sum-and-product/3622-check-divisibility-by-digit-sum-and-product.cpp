class Solution {
public:
    bool checkDivisibility(int n) {
        int sum=0,prod=1;
        int t=n;
        while(t!=0){
            int r=t%10;
            sum+=r;
            prod*=r;
            t/=10;
        }
        return n%(sum+prod)==0;
    }
};