class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        String n="";
        for(char c:s.toCharArray()){
            if(c=='0') n+="1";
            else n+="0";
        }
        int ans=Integer.parseInt(n,2);
        return ans;
    }
}