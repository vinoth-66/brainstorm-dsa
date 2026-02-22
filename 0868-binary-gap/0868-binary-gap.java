class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int count=0,ans=0,f=0;
        for(char c:s.toCharArray()){
            if(c=='1' && f==0) f=1;
            else if(c=='1' && f==1){
                ans=Math.max(count,ans);
                f=1;
                count=0;
            }
            if(f==1) count++;
        }
        return ans;
    }
}