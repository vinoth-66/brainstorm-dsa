class Solution {
    public int[] sumZero(int n) {
        int v=n;
        int[] ans=new int[n];
        for(int i=0;i<n-1;i+=2){
            ans[i]=v;
            if(i+1<n) ans[i+1]=v*-1;
            v--;
        }
        return ans;
    }
}