class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(vin(n,t)){
                return n;
            }
            n+=1;
        }
    }
    public boolean vin(int n, int t){
        int s=1;
        while(n!=0){
            s*=(n%10);
            n/=10;
        }
        return s%t==0;
    }
}