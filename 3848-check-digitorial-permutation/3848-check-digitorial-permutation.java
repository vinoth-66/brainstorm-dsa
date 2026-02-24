class Solution {
    public boolean isDigitorialPermutation(int n) {
        int t=n;
        int ans=0;
        int[] freq=new int[10];
        while(t>0){
            int r=t%10;
            freq[r]++;
            ans+=fact(r);
            t/=10; 
        }
        return vali(ans,freq);
    }
    private int fact(int n){
        if(n==0) return 1;
        if(n==1) return n;
        int v=1;
        for(int i=2;i<=n;i++){
            v*=i;
        }
        return v;
    }
    private boolean vali(int ans,int[] freq){
        while(ans>0){
            int r=ans%10;
            freq[r]--;
            ans/=10;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}