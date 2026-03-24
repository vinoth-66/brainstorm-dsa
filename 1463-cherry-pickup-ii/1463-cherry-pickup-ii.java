class Solution {
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        Integer[][][] memo=new Integer[r][c][c];
        return vin(r,c,0,0,c-1,grid,memo);
    }
    private int vin(int r,int c,int i,int j1,int j2,int[][] mat,Integer[][][] memo){
        if(j1<0 || j1>c-1 || j2<0 || j2>c-1) return -(int)1e9;
        else if(i==r-1){
            if(j1==j2) return mat[i][j1];
            else return mat[i][j1]+mat[i][j2];
        }
        if(memo[i][j1][j2]!=null) return memo[i][j1][j2];
        int max=-1;
        for(int di=-1;di<=1;di++){
            for(int dj=-1;dj<=1;dj++){
                int v=0;
                if(j1==j2) v=mat[i][j1];
                else v=mat[i][j1]+mat[i][j2];
                v+=vin(r,c,i+1,j1+di,j2+dj,mat,memo);
                max=Math.max(max,v);
            }
        }
        return memo[i][j1][j2]=max;
    }
}