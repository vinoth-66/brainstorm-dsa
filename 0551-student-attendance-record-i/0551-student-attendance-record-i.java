class Solution {
    public boolean checkRecord(String s) {
        int ac=0;
        int lc=0;
        for(char c:s.toCharArray()){
            if(c=='A'){
                ac+=1;
                lc=0;
            }
            else if(c=='P') lc=0;
            else if(c=='L'){
                lc+=1;
            }
            if(lc==3) return false; 
        }
        if(ac<2) return true;
        return false;
    }
}