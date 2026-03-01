class Solution {
    public int minCost(int n) {
        return vin(n);
    }
    private int vin(int n){
        if(n==1) return 0;

        int l=0,r=0;
        if(n%2==0){
            l=n/2;
            r=l;
        }
        else{
            l=n/2;
            r=l+1;
        }
        int left=vin(l);
        int right=vin(r);

        return (l*r) + (left) + (right);
    }
}