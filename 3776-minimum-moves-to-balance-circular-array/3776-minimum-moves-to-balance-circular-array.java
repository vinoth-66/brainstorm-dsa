class Solution {
    public long minMoves(int[] balance) {
        long sum=0;
        int in=-1;
        long tar=0;
        for(int i=0;i<balance.length;i++){
            if(balance[i]<0){
                in=i;
                tar-=balance[i];
            }
            sum+=balance[i];
        }
        if(sum<0) return -1;
        int n=balance.length;
        int l=(in-1+n)%n;
        int r=(in+1)%n;
        int dis=1;
        long ans = 0;
        while(tar>0){
            if(balance[l]>0 && tar>0){
                long take=Math.min(balance[l],tar);
                ans+=take*dis;
                tar-=take;
                balance[l]-=take;
            }
            if(balance[r]>0 && tar>0){
                long take=Math.min(balance[r],tar);
                ans+=take*dis;
                tar-=take;
                balance[r]-=take;
            }
            l=(l-1+n)%n;
            r=(r+1)%n;
            dis++;
        }
        return ans;
    }
}