class Solution {
    public String smallestPalindrome(String s) {
        int odd=0;
        int slen=s.length();
        if(slen%2!=0) odd=1;
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        char ochar=' ';
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                if(freq[i]%2!=0) ochar=(char)(i+97);
                freq[i]/=2;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                for(int j=0;j<freq[i];j++){
                    ans.append((char)(i+97));
                }
            }
        }
        StringBuilder res=new StringBuilder(ans);
        ans.reverse();
        if(odd==1) res.append(ochar);
        res.append(ans);
        return res.toString();
    }
}