class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ans=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r-2;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=0;j<c-2;j++){
                if(grid[i][j]<1 || grid[i][j]>9 || grid[i][j+1]<1 || grid[i][j+1]>9 || 
                grid[i][j+2]<1 || grid[i][j+2]>9 || grid[i+1][j]<1 || grid[i+1][j]>9 || 
                grid[i+1][j+1]<1 || grid[i+1][j+1]>9 || grid[i+1][j+2]<1 || grid[i+1][j+2]>9 ||
                grid[i+2][j]<1 || grid[i+2][j]>9 || grid[i+2][j+1]<1 || grid[i+2][j+1]>9 || grid[i+2][j+2]<1 || grid[i+2][j+2]>9) continue;
                else{
                    set.add(grid[i][j]); set.add(grid[i][j+1]); set.add(grid[i][j+2]);
                    set.add(grid[i+1][j]); set.add(grid[i+1][j+1]); set.add(grid[i+1][j+2]);
                    set.add(grid[i+2][j]); set.add(grid[i+2][j+1]); set.add(grid[i+2][j+2]);
                    if(set.size()<9) continue;
                    else{
                        int r1=0,r2=0,r3=0;
                        int c1=0,c2=0,c3=0;
                        int d1=0,d2=0;
                        r1=grid[i][j] + grid[i][j+1] + grid[i][j+2];
                        r2= grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2];
                        r3=grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];

                        c1=grid[i][j] + grid[i+1][j] + grid[i+2][j];
                        c2=grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
                        c3=grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];

                        d1=grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
                        d2=grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];

                        if((r1==r2) && (r1==r3) && (c1==c2) && (c1==c3) && (d1==d2)) ans++; 
                    }
                } 
                set.clear();
            }
        }
        return ans;
    }
}