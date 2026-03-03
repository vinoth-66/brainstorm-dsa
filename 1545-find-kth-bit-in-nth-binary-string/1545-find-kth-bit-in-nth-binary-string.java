class Solution {
    public char findKthBit(int n, int k) {
        String ans=vin(n);
        return ans.charAt(k-1);
    }
    private String vin(int in){
        if(in==1) return "0";
        String str=vin(in-1);
        return str+"1"+helper(str);
    }
    private String helper(String s){
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='1') sb.append('0');
            else sb.append('1');
        }
        sb.reverse();
        return sb.toString();
    }
}