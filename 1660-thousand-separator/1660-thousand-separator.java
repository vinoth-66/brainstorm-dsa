class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        int c=0;
        for(int i=sb.length()-1;i>=0;i--){
            c++;
            if(c==4){
                c=1;
                sb.insert(i+1,".");
            }
        }
        return sb.toString();
    }
}