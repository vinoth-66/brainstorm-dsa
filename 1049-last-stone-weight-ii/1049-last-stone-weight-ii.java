class Solution {
    public int lastStoneWeightII(int[] stones) {
        int s=0;
        for(int i:stones) s+=i;
        int[][] memo=new int[stones.length][s/2+1];
        for(int[] i:memo) Arrays.fill(i,-1);
        int ret=fun(stones,0,s/2,0,memo);
        return s-2*ret;
    }
    private int fun(int[] arr,int in,int s,int bag,int[][] memo){
        if(bag>s) return 0;
        if(in==arr.length) return 0;
        if(memo[in][bag]!=-1) return memo[in][bag];
        int l=fun(arr,in+1,s,bag,memo);

        if(bag+arr[in]<=s){
            int p=arr[in]+fun(arr,in+1,s,bag+arr[in],memo);
            l=Math.max(l,p);
        }
        memo[in][bag]=l;
        return l;
    } 
}