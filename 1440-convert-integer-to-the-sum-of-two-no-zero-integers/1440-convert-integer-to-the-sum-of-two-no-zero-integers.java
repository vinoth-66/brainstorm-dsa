class Solution {
    public int[] getNoZeroIntegers(int n) {
        if(n<=1) return new int[]{};
        int s=1;
        int e=n-1;
        if(fun(1,n-1,n)) return new int[]{1,n-1};
        else{
            while(s<=e){
                if(fun(s,e,n)) return new int[]{s,e};
                s++;
                e--;
            }
        }
        return new int[]{};
    }
private boolean fun(int s,int e,int ans){
        String c1=String.valueOf(s);
        String c2=String.valueOf(e);
        if(c1.contains("0") || c2.contains("0")) return false;
        if(s+e==ans){
            return true;
        }
        return false;
    }
}