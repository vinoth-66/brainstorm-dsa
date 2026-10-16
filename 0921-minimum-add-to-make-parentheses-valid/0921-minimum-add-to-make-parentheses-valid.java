class Solution {
    public int minAddToMakeValid(String s) {
        int cnt=0;
        int ans=0;
        for(char c:s.toCharArray()){
            if(c=='(') cnt++;
            else{
                if(cnt==0){
                    ans++;
                }
                else cnt--;
            }
        }
        return ans+cnt;
    }
}