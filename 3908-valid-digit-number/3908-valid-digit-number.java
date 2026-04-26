class Solution {
    public boolean validDigit(int n, int x) {
        int p=-1,f=0;
        while(n!=0){
            int r=n%10;
            if(r==x){
                f=1;  
            }
            p=r;
            n/=10;
        }
        if(f==1 && p!=x){
            return true;
        }
        return false;
    }
}