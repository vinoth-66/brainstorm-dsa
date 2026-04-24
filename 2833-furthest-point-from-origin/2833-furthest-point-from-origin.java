class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cl=0,cr=0;
        for(char c:moves.toCharArray()){
            if(c=='L') cl++;
            else if(c=='R') cr++;
        }
        StringBuilder sb=new StringBuilder(moves);
        if(cl>=cr) replace(sb,-1);
        else replace(sb,1);
        int ans=0;
        for(char c:sb.toString().toCharArray()){
            if(c=='L') ans--;
            else ans++;
        }
        return Math.abs(ans);
    }
    private void replace(StringBuilder sb,int v){
        for(int i=0;i<sb.length();i++){
            if(v==-1 && sb.charAt(i)=='_'){
                sb.setCharAt(i,'L');
            }
            else if(v==1 && sb.charAt(i)=='_'){
                sb.setCharAt(i,'R');
            }
        }
    }
}