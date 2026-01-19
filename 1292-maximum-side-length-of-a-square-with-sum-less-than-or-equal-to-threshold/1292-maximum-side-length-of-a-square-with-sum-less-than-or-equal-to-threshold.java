class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int r=mat.length;
        int c=mat[0].length;
        int[][] ps=new int[r][c];
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                if(i==0) ps[i][j]=mat[i][j];
                else ps[i][j]=ps[i-1][j]+mat[i][j];
            }
        }
        return bin(r,c,ps,threshold);
    }
    private int bin(int r,int c,int[][] ps,int t){
        int s=1,e=0;
        if(r>c) e=c;
        else e=r;
        if(e==s) return 1;
        else if(e<s) return 0;
        int ans=0;
        while(s<=e){
            int m=(s+e)/2;
            if(fun(m,r,c,ps,t)){
                ans=m;
                s=m+1;
            }
            else e=m-1;
        }       
        return ans;
    }
    private boolean fun(int m,int r,int c,int[][] ps,int t){
        int v=m-1;
        for(int i=v;i<r;i++){
            for(int j=0;j<c-v;j++){
                int s=0;
                for(int k=j;k-j<m;k++){
                    if(i==v) s+=ps[i][k];
                    else s+=ps[i][k]-ps[i-m][k];
                }
                if(s<=t) return true;
            }
        }
        return false;
    }
}