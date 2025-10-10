class Solution {
    public int countSegments(String s) {
        if(s.trim().isEmpty() || s == null) return 0;
         String[] str=s.trim().split("\\s+");
        return str.length;
    }
}