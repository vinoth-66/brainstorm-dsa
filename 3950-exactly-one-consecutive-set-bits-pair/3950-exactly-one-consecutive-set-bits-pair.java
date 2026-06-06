class Solution {
    public boolean consecutiveSetBits(int n) {
        String str=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='1' && str.charAt(i+1)=='1') c++;
            if(c==2) return false;
        }
        if(c==1) return true;
        return false;
    }
}