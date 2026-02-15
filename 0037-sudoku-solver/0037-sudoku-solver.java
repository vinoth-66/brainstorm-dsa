class Solution {
    public void solveSudoku(char[][] board) {
        vin(board);
    }
    private boolean vin(char[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(c,i,j,arr)){
                            arr[i][j]=c;
                            if(vin(arr)){
                                return true;
                            }
                            else arr[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char ch,int r,int c,char[][] arr){
        for(int i=0;i<9;i++){
            if(arr[r][i]==ch) return false;
            if(arr[i][c]==ch) return false;
            if(arr[3*(r/3)+i/3][3*(c/3)+i%3]==ch) return false;
        }
        return true;
    }
}