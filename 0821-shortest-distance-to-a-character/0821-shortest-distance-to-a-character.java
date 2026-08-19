class Solution {
    int ind=-1;
    public int[] shortestToChar(String s, char c) {
        int st=-1;
        int e=-1;
        int l=s.length();
        int[] ans=new int[l];
        int f=0;
        for(int i=0;i<l;i++){
            if(i>e && f!=1){
                st=e;
                e=helper(s,ind,c);
                if(e==-1) f=1;
            }
            if(s.charAt(i)==c){
                ans[i]=0;
            }
            else{
                if(st==-1 && e!=-1) ans[i]=Math.abs(i-e);
                else if(e==-1 && st!=-1) ans[i]=Math.abs(i-st);
                else ans[i]=Math.min(Math.abs(i-st),Math.abs(i-e));
            }
        }
        return ans;
    }
    public int helper(String s,int indx,int c){
        int in=0;
        if(indx!=-1) in=indx;
        for(int i=in;i<s.length();i++){
            if(s.charAt(i)==c){
                ind=i+1;
                return i;
            }
        }
        return -1;
    }
}