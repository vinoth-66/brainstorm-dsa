class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long[] rpre=new long[grid.length];
        long[] cpre=new long[grid[0].length];
        long tot=0;
        rpre[0]=0;
        for(int i=0;i<grid.length;i++){
            long s=0;
            for(int j=0;j<grid[0].length;j++){
                s+=grid[i][j];
            }
            tot+=s;
            if(i==0) rpre[i]=s;
            else rpre[i]=rpre[i-1]+s;
        }
        for(int j=0;j<grid[0].length;j++){
            long s=0;
            for(int i=0;i<grid.length;i++){
                s+=grid[i][j];
            }
            if(j==0) cpre[j]=s;
            else cpre[j]=cpre[j-1]+s;
        }
        for(int i=0;i<grid.length;i++){
            if(rpre[i]==tot-rpre[i]) return true;
        }
        for(int j=0;j<grid[0].length;j++){
            if(cpre[j]==tot-cpre[j]) return true;
        }
        return false;
    }
}