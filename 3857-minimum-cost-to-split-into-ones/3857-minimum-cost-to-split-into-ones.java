class Solution {
    public int minCost(int n) {
        int[] memo=new int[n+1];
        Arrays.fill(memo,-1);
        return vin(n,memo);
    }
    private int vin(int n,int[] memo){
        if(n==1) return 0;
        if(memo[n]!=-1) return memo[n];
        int l=0,r=0;
        if(n%2==0){
            l=n/2;
            r=l;
        }
        else{
            l=n/2;
            r=l+1;
        }
        int left=vin(l,memo);
        int right=vin(r,memo);

        return memo[n]=(l*r) + (left) + (right);
    }
}