class Solution {
    public String trimTrailingVowels(String s) {
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}