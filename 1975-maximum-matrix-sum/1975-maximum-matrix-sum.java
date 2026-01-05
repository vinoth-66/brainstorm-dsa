class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int s=0,min=Integer.MAX_VALUE,c=0,f=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    c++;
                    s+=Math.abs(matrix[i][j]);
                }
                else if(matrix[i][j]==0) f=1;
                else s+=matrix[i][j];
                min=Math.min(min,Math.abs(matrix[i][j]));
            }
        }
        if(c==0 || c%2==0 || f==1) return s;
        return s-min-min;
    }
}