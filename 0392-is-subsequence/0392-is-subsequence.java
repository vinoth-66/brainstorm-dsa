class Solution {
    public boolean isSubsequence(String s, String t) {
        int ind=-1;
        for(char c:s.toCharArray()){
            ind=t.indexOf(c,ind+1);
            if(ind==-1) return false;
        }
        return true;
    }
}