class Solution {
    public boolean makesquare(int[] matchsticks) {
        int s=0;
        for(int i=0;i<matchsticks.length;i++){
            s+=matchsticks[i];
        }
        if(s%4!=0) return false;
        Arrays.sort(matchsticks);
        int[] bucket=new int[4];
        return fun(matchsticks,matchsticks.length-1,s/4,bucket);
    }
    private boolean fun(int[] matchsticks,int in,int t,int[] buk){
        if(in==-1) return true;
        for(int i=0;i<4;i++){
            if(buk[i]+matchsticks[in]<=t){
                buk[i]+=matchsticks[in];
                if(fun(matchsticks,in-1,t,buk)) return true;
                buk[i]-=matchsticks[in];
            }
        }
        return false;
    }
}