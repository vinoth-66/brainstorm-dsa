class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        int[][] vis=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0)){
                    vis[i][j]=1;
                    if(vin(i,j,1,word,board,vis,r,c)) return true;
                    vis[i][j]=0;
                }
            }
        }
        return false;
    }
    private boolean vin(int i,int j,int in,String s,char[][] mat,int[][] vis,int r,int c){
        if(in==s.length()) return true;
        if(i==r && j==c) return false;

        if(j+1<c && vis[i][j+1]!=1 && mat[i][j+1]==s.charAt(in)){
            vis[i][j]=1;
            if(vin(i,j+1,in+1,s,mat,vis,r,c)) return true;
            vis[i][j]=0;
        }

        if(j-1>=0 && vis[i][j-1]!=1 && mat[i][j-1]==s.charAt(in)){
            vis[i][j]=1;
            if(vin(i,j-1,in+1,s,mat,vis,r,c)) return true;
            vis[i][j]=0;
        }

        if(i+1<r && vis[i+1][j]!=1 && mat[i+1][j]==s.charAt(in)){
            vis[i][j]=1;
            if(vin(i+1,j,in+1,s,mat,vis,r,c)) return true;
            vis[i][j]=0;
        }

        if(i-1>=0 && vis[i-1][j]!=1 && mat[i-1][j]==s.charAt(in)){
            vis[i][j]=1;
            if(vin(i-1,j,in+1,s,mat,vis,r,c)) return true;
            vis[i][j]=0;
        }

        return false;
    }
}