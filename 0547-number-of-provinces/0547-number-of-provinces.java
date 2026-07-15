class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj=new ArrayList<>();
        int n=isConnected.length;
        int c=isConnected[0].length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<c;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int[] vis=new int[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(vis[i]!=1){
                ans++;
                dfs(i,vis,adj);
            }
        }
        return ans;
    }
    public void dfs(int el,int[] vis,List<List<Integer>> adj){
        vis[el]=1;
        for(int i:adj.get(el)){
            if(vis[i]!=1){
                dfs(i,vis,adj);
            }
        }
    }
}