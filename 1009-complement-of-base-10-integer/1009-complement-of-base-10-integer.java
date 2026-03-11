class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='1') sb.append("0");
            else sb.append("1");
        }       
        int ans=Integer.parseInt(sb.toString(),2);
        return ans;
    }
}