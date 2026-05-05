class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev=0;
        int t=n;
        while(t!=0){
            int r=t%10;
            rev=(rev*10)+r;
            t/=10;
        }
        int s=0,e=0;
        if(rev>n){
            s=n;
            e=rev;
        }
        else{
            s=rev;
            e=n;
        }
        int[] prime=new int[e+1];
        for(int i=2;i*i<=e;i++){
            if(prime[i]==0){
                for(int j=i*i;j<=e;j+=i){
                    prime[j]=1;
                }
            }
        }
        int sum=0;
        for(int i=s;i<=e;i++){
            if(i==1) continue;
            if(prime[i]==0){
                sum+=i;
            }
        }
        return sum;
    }
}