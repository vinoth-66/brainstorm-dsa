class Solution {
    public int rotatedDigits(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            int t=i;
            int v=1,rot=0;
            while(t!=0){
                int r=t%10;
                if(r==3 || r==4 || r==7){
                    v=0;
                    break;
                }
                if(r==2 || r==5 || r==6 || r==9) rot=1;
                t/=10;
            }
            if(v==1 && rot==1) ans++;
        }
        return ans;
    }
}