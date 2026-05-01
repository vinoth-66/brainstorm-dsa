class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans=new StringBuilder();
        int in=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                in=i;
                break;
            }
        }
        if(in==-1) return word;
        ans.append(word.substring(0,in+1));
        ans.reverse();
        return ans.toString()+word.substring(in+1);
    }
}