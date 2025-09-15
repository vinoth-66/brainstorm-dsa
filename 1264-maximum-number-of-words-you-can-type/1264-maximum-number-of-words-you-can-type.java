class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str=text.split(" ");
        int ans=str.length;
        for(String s:str){
            for(int i=0;i<brokenLetters.length();i++){
                if(s.contains(String.valueOf(brokenLetters.charAt(i)))){
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}