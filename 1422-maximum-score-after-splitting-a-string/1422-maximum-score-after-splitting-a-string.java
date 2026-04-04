class Solution {
    public int maxScore(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') c++;
        }
        if(s.length()==c) return c-1;
        int ans=0;
        int z=0;
        if(s.charAt(0)=='0') z++;
        else c--;
        ans=Math.max(ans,c+z);
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)=='0') z++;
            else c--;
            ans=Math.max(ans,c+z);
        }
        if(z==s.length()) return z-1;
        return ans;
    }
}