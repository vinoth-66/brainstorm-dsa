class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans=new int[r][c];
        int row=mat.length;
        int col=mat[0].length;
        if (row * col != r * c) return mat;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                list.add(mat[i][j]);
            }
        }
        int in=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=list.get(in++);
            }
        }

        return ans;

    }
}