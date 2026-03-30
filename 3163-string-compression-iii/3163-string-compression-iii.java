class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        int n=word.length();
        while(i<n){
            j=i;
            int c=1;
            while(j<n-1 && word.charAt(j)==word.charAt(j+1)){
                c++;
                j++;
                if(c==9){
                    sb.append((char)(c+'0'));
                    sb.append(word.charAt(i));
                    c=0;
                }
            }
            if(c!=0) sb.append((char)(c+'0'));
            if(c!=0) sb.append(word.charAt(i));
            i=j+1;
        }
        return sb.toString();
    }
}