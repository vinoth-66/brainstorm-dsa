class Solution {
    public long sumAndMultiply(int n) {
        String str=String.valueOf(n);
        str=str.replaceAll("0","");
        if (str.isEmpty()) return 0;
        long num=Long.parseLong(str);
        long s=0;
        for(int i=0;i<str.length();i++){
            s+=str.charAt(i)-'0';
        }
        return num*s;
    }
}