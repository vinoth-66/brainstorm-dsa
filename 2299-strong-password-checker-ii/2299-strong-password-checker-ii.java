class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        int len=password.length();
        int s=0,b=0,d=0,sp=0;
        String str="!@#$%^&*()-+";
        char ch=password.charAt(0);
        if(ch==password.charAt(1)) return false;
        if(ch>='a' && ch<='z') s=1;
        else if(ch>='A' && ch<='Z') b=1;
        else if(ch>='0' && ch<='9') d=1;
        else if(str.indexOf(ch)!=-1) sp=1;
        for(int i=len-1;i>0;i--){
            char c=password.charAt(i);
            if(c==password.charAt(i-1)) return false;
            if(c>='a' && c<='z' && s!=1) s=1;
            else if(c>='A' && c<='Z' && b!=1) b=1;
            else if(c>='0' && c<='9' && d!=1) d=1;
            else if(str.indexOf(c)!=-1 && sp!=1) sp=1;
        }
        if(s==1 && b==1 && d==1 && sp==1) return true;
        return false;
    }
}