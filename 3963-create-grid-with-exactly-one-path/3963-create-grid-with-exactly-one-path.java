class Solution {
    public String[] createGrid(int m, int n) {
        char[][] mat=new char[m][n];
        for(char[] i:mat) Arrays.fill(i,'#');
        int i=0,j=0;
        while(i!=m && j!=n){
            mat[i][j]='.';
            if(j+1<n) j+=1;
            else if(i+1<m) i+=1;
            else break;
        }
        String[] ans=new String[m];
        int in=0;
        for(char[] c:mat){
            StringBuilder sb=new StringBuilder();
            for(char ch:c) sb.append(ch);
            ans[in]=sb.toString();
            in++;
        }
        return ans;
    }
}