class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] memo=new int[text1.length()][text2.length()];
        for(int[] row:memo) Arrays.fill(row,-1);
        return lcs(text1,text2,0,0,memo);
    }
    private int lcs(String t1,String t2,int i,int j,int[][] memo){
        if(i>t1.length()-1 || j>t2.length()-1) return 0;

        if(memo[i][j]!=-1) return memo[i][j];

        if(t1.charAt(i)==t2.charAt(j)){
            int p=1+lcs(t1,t2,i+1,j+1,memo);
            return memo[i][j]=p;
        }
        else{
            int l1=lcs(t1,t2,i+1,j,memo);
            int l2=lcs(t1,t2,i,j+1,memo);

            return memo[i][j]=Math.max(l1,l2);
        }
    }
}