class Solution {
public:
    int integerReplacement(int n) {
        int c=0;
        long long N=n;
        while(N>1){
            if(N%2==0) N/=2;
            else if(N==3 || N%4==1) N-=1;
            else N+=1;
            c++;
        }
        return c;
    }
};