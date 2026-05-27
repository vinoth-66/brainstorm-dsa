class Solution {
    public int numberOfSpecialChars(String word) {
        int[] up=new int[26];
        int[] sml=new int[26];
        Arrays.fill(sml,-1);
        Arrays.fill(up,-1);
        int[] vis2=new int[26];
        int ans=0;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(c)){
                char ch=Character.toLowerCase(c);
                if(up[ch-97]!=-1) continue;
                if(sml[ch-97]!=-1){
                    ans++;
                    vis2[ch-97]++;
                }
                up[ch-97]=i;
            }
            else{
                if(up[c-97]!=-1 && vis2[c-97]!=0){
                    ans--;
                    vis2[c-97]--;
                }
                sml[c-97]=i;
            }
        }
        return ans;
    }
}