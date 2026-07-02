class Solution {
    public String countAndSay(int n) {
        return vin(n);
    }
    public String vin(int n){
        if(n==1) return "1";
        String s=vin(n-1);
        int c=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) c++;
            else{
                sb.append(String.valueOf(c)+s.charAt(i));
                c=1;
            }
        }
        sb.append(String.valueOf(c)+s.charAt(s.length()-1));
        return sb.toString();
    }
}