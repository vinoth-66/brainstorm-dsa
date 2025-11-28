class Solution {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] memo=new int[row][col];
        for(int[] arr:memo){
            Arrays.fill(arr,-1);
        }
        return(minCost(row,col,0,0,grid,memo));
    }
    private int minCost(int row,int col,int r,int c,int[][] grid,int[][] memo){
        if(r>row-1 || c>col-1) return 10000000;

        if(r==row-1 && c==col-1) return grid[r][c];

        if(memo[r][c]!=-1) return memo[r][c]; 

        int down=minCost(row,col,r+1,c,grid,memo);
        int right=minCost(row,col,r,c+1,grid,memo);

        int ans=grid[r][c]+Math.min(down,right);
        memo[r][c]=ans;
        return ans;
    }
}