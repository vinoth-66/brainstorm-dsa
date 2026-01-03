class Solution {
    public boolean checkValidString(String s) {
        int c=0;
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c=c+1;
                a=a+1;
            }
            else if(s.charAt(i)==')'){
                c=c-1;
                a=a-1;
            }
            else{
                c=c-1;
                a=a+1;
            }
            if(c<0) c=0;
            if(a<0) return false;
        }
        return c==0;
    }
}