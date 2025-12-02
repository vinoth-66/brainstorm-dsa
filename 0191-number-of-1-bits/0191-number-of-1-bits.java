class Solution {
    public int hammingWeight(int n) {
        // String s=Integer.toBinaryString(n);
        // long num=Integer.parseInt(s);
        // int c=0;
        // for(char ch:s.toCharArray()){
        //     if(ch=='1') c++;
        // }
        return Integer.bitCount(n);
    }
}