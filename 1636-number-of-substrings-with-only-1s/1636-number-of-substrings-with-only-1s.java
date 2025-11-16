class Solution {
    public int numSub(String s) {
        int i=0;
        long ans=0;
        int m=1000000007;
        while(i<s.length()){
            int c=0;
            if(s.charAt(i)=='1'){
                int j=i;
                while(j<s.length() && s.charAt(j)=='1'){
                    c++;
                    j++;
                }
                i=j;
                ans=(ans+(long)c*(c + 1)/2)%m;            
            }
            else i++;
        }
        return (int)ans;
    }
}