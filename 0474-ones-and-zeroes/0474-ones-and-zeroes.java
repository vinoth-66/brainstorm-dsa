class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        Integer[][][] memo=new Integer[strs.length][m+1][n+1];
        return pdp(strs,0,m,n,memo);
    }
    private int pdp(String[] str,int in,int m,int n,Integer[][][] memo){
        if(in==str.length){
            return 0;
        }
        if(memo[in][m][n]!=null) return memo[in][m][n]; 
        int leave=pdp(str,in+1,m,n,memo);
        int[] val=count(str[in]);
        if(m>=val[0] && n>=val[1]){
            int pick=1+pdp(str,in+1,m-val[0],n-val[1],memo);
            leave=Math.max(pick,leave);
        }
        memo[in][m][n]=leave;
        return leave;
    }
    private int[] count(String s){
        int z=0,o=0;
        for(char c:s.toCharArray()){
            if(c=='1') o++;
            else z++;
        }
        return new int[]{z,o};
    }
}