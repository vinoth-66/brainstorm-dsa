class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int r=grid.length;
        int c=grid[0].length;
        int[][] vis=new int[r][c];
        int fresh=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                    vis[i][j]=1;
                }
                // else if(grid[i][j]==1) fresh++;
            }
        }
        // if(fresh==0) return 0;
        int ans=0;
        while(!q.isEmpty()){
            int len=q.size();
            int f=0;
            for(int v=0;v<len;v++){
                int[] ind=q.poll();
                for(int i=-1;i<=1;i++){
                    for(int j=-1;j<=1;j++){
                        if(Math.abs(i)==Math.abs(j)) continue;
                        int ui=i+ind[0];
                        int uj=j+ind[1];
                        if(ui>-1 && uj>-1 && ui<r && uj<c && 
                        vis[ui][uj]==0 && grid[ui][uj]==1){
                            vis[ui][uj]=1;
                            q.offer(new int[]{ui,uj});
                            grid[ui][uj]=2;
                            f=1;
                        }
                    }
                }
            }
            if(f==1) ans++;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return ans;
    }
}