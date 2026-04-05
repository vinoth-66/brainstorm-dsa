class Solution {
    public long getDescentPeriods(int[] prices) {
        int s=0,e=0;
        long ans=0;
        long v=0;
        int f=0;
        while(s<prices.length){
            e=s;
            while(e<prices.length-1 && prices[e]-1==prices[e+1]){
                e++;
                f=1;
            }
            v=e-s+1;
            ans+=(v*(v+1)/2);
            if(f==1){
                s=e+1;
                f=0;
            }
            else s++;
        }
        return ans;
    }
}