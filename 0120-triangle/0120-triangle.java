class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Integer[][] memo=new Integer[triangle.size()][triangle.size()];
        return vin(triangle,0,0,triangle.size(),memo);
    }
    private int vin(List<List<Integer>> tri,int i,int j,int r,Integer[][] memo){
        // if(i>r || j>tri.get(i).size()-1) return Integ;
        if(i==r) return 0;
        if(memo[i][j]!=null) return memo[i][j];
        int d=vin(tri,i+1,j,r,memo);
        int ri=vin(tri,i+1,j+1,r,memo);
        return memo[i][j]=tri.get(i).get(j) + Math.min(d,ri);
    }
}