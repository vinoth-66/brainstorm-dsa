class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo=new int[m][n];
        for(int[] arr:memo) Arrays.fill(arr,-1);
        return ways(m,n,0,0,memo);
    }
    private int ways(int row,int col,int r,int c,int[][] memo){
        if(r>row-1 || c>col-1) return 0;
        if(r==row-1 && c==col-1) return 1;
        if(memo[r][c]!=-1) return memo[r][c];
        int down=ways(row,col,r+1,c,memo);
        int right=ways(row,col,r,c+1,memo);

        return memo[r][c]=down+right;
    }
}