class Solution {
    public boolean canBeEqual(String s1, String s2) {
        // for(int i=0;i<2;i++){
        //     if(s1.charAt(i)==s2.charAt(i) || s1.charAt(i)==s2.charAt())
        // }

        StringBuilder sb=new StringBuilder(s1);
        if(sb.toString().equals(s2)) return true;
        char t=sb.charAt(0);
        sb.setCharAt(0,sb.charAt(2));
        sb.setCharAt(2,t);
        if(sb.toString().equals(s2)) return true;
        char temp=sb.charAt(1);
        sb.setCharAt(1,sb.charAt(3));
        sb.setCharAt(3,temp);
        if(sb.toString().equals(s2)) return true;
        StringBuilder sb2=new StringBuilder(s1);
        char te=sb2.charAt(1);
        sb2.setCharAt(1,sb2.charAt(3));
        sb2.setCharAt(3,te);
        if(sb2.toString().equals(s2)) return true;
        return false;
    }
}