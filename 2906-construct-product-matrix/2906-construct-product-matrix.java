class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int l=grid.length*grid[0].length;
        int[] arr=new int[l];
        int[] pre=new int[l];
        int[] suf=new int[l];
        int in=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                arr[in++]=grid[i][j]%12345;
            }   
        }
        pre[0]=1;
        suf[l-1]=1;
        for(int i=1;i<arr.length;i++){
            pre[i]=(arr[i-1]*pre[i-1])%12345;
        }
        for(int i=l-2;i>=0;i--){
            suf[i]=(suf[i+1]*arr[i+1])%12345;
        }
        int[][] ans=new int[grid.length][grid[0].length];
        int ind=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans[i][j]=(pre[ind]*suf[ind])%12345;
                ind++;
            }
        }
        return ans;
    }
}