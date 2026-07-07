class Solution {
public:
    long long sumAndMultiply(int n) {
        long long sum=0;
        long long ans=0;
        int p=1;
        while(n!=0){
            int r=n%10;
            n/=10;
            if(r==0) continue;
            sum+=r;
            ans+=(r*p);
            p*=10;
        }
        return ans*sum;
    }
};