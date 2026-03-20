class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;   
        int[][] ans=new int[n-k+1][m-k+1];
        for(int i=0;i<n-k+1;i++){
            for(int j=0;j<m-k+1;j++){
                HashSet<Integer> set=new HashSet<>();
                for(int v=i;v<i+k;v++){
                    for(int h=j;h<j+k;h++){
                        set.add(grid[v][h]);
                    }
                }
                int vh=fun(set);
                ans[i][j]=vh;
            }
        }
        return ans;
    }
    private int fun(HashSet<Integer> set){
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            ans=Math.min(ans,list.get(i)-list.get(i-1));
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}