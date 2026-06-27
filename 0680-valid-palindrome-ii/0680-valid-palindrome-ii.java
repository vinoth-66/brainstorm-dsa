class Solution {
    public boolean validPalindrome(String s) {
        if(vin(s,0,s.length()-1)) return true;
        int l=0,e=s.length()-1;
        while(l<e){
            if(s.charAt(l)==s.charAt(e)){
                l++;
                e--;
            }
            else{
                return vin(s,l+1,e) || vin(s,l,e-1);
            }
        }
        return false;
    }
    public boolean vin(String st,int s,int e){
        while(s<e){
            if(st.charAt(s)!=st.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}