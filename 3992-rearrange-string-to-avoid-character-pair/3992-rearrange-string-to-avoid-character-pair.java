class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==y) sb.append(c);
            else sb2.append(c);
        }
        return sb.toString()+sb2.toString();
    }
}