class Solution {
    public boolean judgeCircle(String moves) {
        int c1=0,c2=0,c3=0,c4=0;
        for(char c:moves.toCharArray()){
            if(c=='U') c1++;
            else if(c=='D') c2++;
            else if(c=='L') c3++;
            else if(c=='R') c4++;
        }
        if(c1-c2==0 && c3-c4==0) return true;
        return false;
    }
}