class Solution {
    public int countSquares(int[][] matrix) {
        int ans=0;
        int rl=matrix.length;
        int cl=matrix[0].length;
        for(int i=0;i<rl;i++){
            for(int j=0;j<cl;j++){
                if(matrix[i][j]==1){
                    ans+=fun(matrix,i,j,rl,cl);
                }
            }
        }
        return ans;
    }
    private int fun(int[][] mat,int i,int j,int rl,int cl){
        int prev=-1;
        int ind=0;
        int sq=0;
        for(int a=i;a<rl;a++){
            int c=0;
            sq++;
            for(int b=j;b<cl;b++){
                if(mat[a][b]==1) c++;
                else break;
            }
            if(c<sq){
                ind=sq-1;
                break;
            }
            else if(c==sq){
                ind=sq;
                break;
            }
            if(prev==-1 || c<prev) prev=c;
            if(prev!=-1 && prev==sq){
                ind=sq;
                break;
            }
            ind=sq;
        }
        return ind;
    }
}