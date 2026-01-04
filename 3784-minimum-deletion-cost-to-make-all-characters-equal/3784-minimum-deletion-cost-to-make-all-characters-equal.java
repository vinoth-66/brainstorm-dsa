class Solution {
    public long minCost(String s, int[] cost) {
        long[] arr=new long[26];
        long sum=0,m=-1;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97]+=cost[i];
            sum+=cost[i];
            m=Math.max(m,arr[s.charAt(i)-97]);
        }
        return sum-m;
    }
}