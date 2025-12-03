class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isDigit(s.charAt(i))){
                sb.deleteCharAt(i);
                c++;
            }
            else{
                if(c>0){
                    sb.deleteCharAt(i);
                    c--;
                }
            }
        }
        return sb.toString();    
    }
}