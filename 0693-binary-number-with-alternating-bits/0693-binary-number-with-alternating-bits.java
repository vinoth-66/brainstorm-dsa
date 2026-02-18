class Solution {
    public boolean hasAlternatingBits(int n) {
        int f=1,p=-1;
        while(n!=0){
            int v=n%2;
            if(f==0 && v==p) return false;
            p=v;
            n/=2;
            if(f==1) f=0;
        }
        return true;
    }
}