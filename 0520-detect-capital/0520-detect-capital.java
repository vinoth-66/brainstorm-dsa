class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        for(int i=word.length()-1;i>=0;i--){
            if(word.charAt(i)==Character.toUpperCase(word.charAt(i))) c++;
            
        }
        if(c==word.length()) return true;
        else if(c==0 && word.length()>=1) return true;
        else if(c==1 && word.charAt(0)==Character.toUpperCase(word.charAt(0))) return true;
        return false;
    }
}