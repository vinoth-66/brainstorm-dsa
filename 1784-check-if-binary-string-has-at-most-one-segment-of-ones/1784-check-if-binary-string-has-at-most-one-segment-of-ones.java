class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.charAt(0)==0) return false;
        int i=0;
        while(i<s.length() && s.charAt(i)=='1') i++;
        if(i==s.length()) return true;
        String str=s.substring(i);
        if(str.contains("1")) return false;
        return true;
    }
}