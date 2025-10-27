class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        else if(b.length()>a.length()) return b.length();
        return a.length();
    }
}