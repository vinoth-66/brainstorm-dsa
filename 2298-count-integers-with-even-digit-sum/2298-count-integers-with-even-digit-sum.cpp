class Solution {
public:
    int countEven(int num) {
        int ans=0;
        for(int i=1;i<=num;i++){
            if(fun(i)) ans++;
        }
        return ans;
    }
private:
    bool fun(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        if(sum%2==0) return true;
        return false;
    }
};