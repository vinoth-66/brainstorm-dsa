class Solution {
    public int numSquares(int n) {
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            arr.add(i*i);
        }
        int[][] memo=new int[arr.size()][n+1];
        for(int[] i:memo) Arrays.fill(i,-1);
        int ans=fun(n,0,arr,memo);
        if(ans>=10000000) return 0;
        return ans;
    }
    private int fun(int n,int in,List<Integer> arr,int[][] memo){
        if(n==0) return 0;
        else if(n<0) return 10000000;
        if(in==arr.size()) return 10000000;
        if(memo[in][n]!=-1) return memo[in][n];
        int l=fun(n,in+1,arr,memo);

        if(n-arr.get(in)>=0){
            int p=1+fun(n-arr.get(in),in,arr,memo);
            l=Math.min(l,p);
        }
        memo[in][n]=l;
        return l;
    }
}