class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int rl=boxGrid.length;
        int cl=boxGrid[0].length;
        char[][] ans=new char[cl][rl];
        for(int i=0;i<cl;i++){
            for(int j=0;j<rl;j++){
                ans[i][j]='.';
            }
        }
        for(int i=rl-1;i>=0;i--){
            int emt=cl-1;
            for(int j=cl-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    ans[j][rl-i-1]='*';
                    emt=j-1;
                }
                else if(boxGrid[i][j]=='#'){
                    ans[emt][rl-i-1]='#';
                    emt-=1;
                }
            }
        }
        return ans;
    }
}