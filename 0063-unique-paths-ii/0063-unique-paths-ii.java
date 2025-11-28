class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;

        int[][] memo=new int[row][col];

        for(int[] arr:memo){
            Arrays.fill(arr,-1);
        }

        return ways(row,col,0,0,obstacleGrid,memo);

    }
    private int ways(int row,int col,int r,int c,int[][] obstacleGrid,int[][] memo){
        if(r>row-1 || c>col-1 || obstacleGrid[r][c]==1) return 0;
        if(r==row-1 && c==col-1) return 1;

        if(memo[r][c]!=-1) return memo[r][c];

        int down=ways(row,col,r+1,c,obstacleGrid,memo);
        int right=ways(row,col,r,c+1,obstacleGrid,memo);

        return memo[r][c]=down+right;
    }
}