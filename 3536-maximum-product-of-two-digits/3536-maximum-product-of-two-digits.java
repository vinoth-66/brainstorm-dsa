class Solution {
    public int maxProduct(int n) {
        if(n==0 || n/10==0) return n;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(n!=0){
            int r=n%10;
            if(r>max){
                if(max!=Integer.MAX_VALUE) min=max;
                max=r;
            }
            else min=Math.max(min,r);
            n/=10;
        }
        return min*max;
    }
}