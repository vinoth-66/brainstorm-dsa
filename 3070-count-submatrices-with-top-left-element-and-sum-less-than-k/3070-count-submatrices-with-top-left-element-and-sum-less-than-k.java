class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int r=grid.length;
        int c=grid[0].length;
        int[][] mat=new int[r][c];
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==0 && j==0) || j==0) mat[i][j]=grid[i][j];
                else mat[i][j]=mat[i][j-1]+grid[i][j];
            }
        }
        for(int i=0;i<r;i++){
            int s=0;
            for(int j=0;j<c;j++){
                if(i==0){
                    s=mat[i][j];
                    if(s<=k) ans++;
                }
                if(i>0){
                    s=mat[i][j]+mat[i-1][j];
                    if(s<=k) ans++;
                    mat[i][j]=s;
                }
            } 
        }
        return ans;
    }
}