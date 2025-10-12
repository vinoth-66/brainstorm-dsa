class Solution {
    public boolean scoreBalance(String s) {
        if(s.length()<2) return false;
        else{
            int f=0;
            for(int i=0;i<s.length()-1;i++) f+=s.charAt(i)-96;
            int l=s.charAt(s.length()-1)-96;
            for(int i=s.length()-2;i>=0;i--){
                if(f==l) return true;
                else{
                    f-=s.charAt(i)-96;
                    l+=s.charAt(i)-96;
                }
            }
            return false;
        }
    }
}