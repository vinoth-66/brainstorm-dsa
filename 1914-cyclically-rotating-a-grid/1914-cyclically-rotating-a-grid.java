class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int rl=grid.length;
        int cl=grid[0].length;
        int t=0,l=0,r=cl-1,b=rl-1;
        while(l<=r && t<=b){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=l;i<=r;i++){
                list.add(grid[t][i]);
            }
            for(int i=t+1;i<=b;i++){
                list.add(grid[i][r]);
            }
            if(t<=b){
                for(int i=r-1;i>=l;i--){
                    list.add(grid[b][i]);
                }
            }
            if(l<=r){
                for(int i=b-1;i>t;i--){
                    list.add(grid[i][l]);    
                }
            }
            int rot=k%list.size();
            Collections.rotate(list,-rot);
            int in=0;
            for(int i=l;i<=r;i++){
                grid[t][i]=list.get(in++);
            }
            for(int i=t+1;i<=b;i++){
                grid[i][r]=list.get(in++);
            }
            if(t<=b){
                for(int i=r-1;i>=l;i--){
                    grid[b][i]=list.get(in++);
                }
            }
            if(l<=r){
                for(int i=b-1;i>t;i--){
                    grid[i][l]=list.get(in++);    
                }
            }
            t++;
            l++;
            b--;
            r--;
        }
        return grid;
    }
}