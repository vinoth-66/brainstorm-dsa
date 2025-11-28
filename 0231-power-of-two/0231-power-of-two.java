class Solution {
    public boolean isPowerOfTwo(int n) {
        // return n>0 && Integer.bitCount(n)==1;

        // if(n <= 0){
        //     return false;
        // }
        // while(n%2 == 0){
        //     n /= 2;
        // }
        // if(n == 1){
        //     return true;
        // }
        // return false;
        return linear(n);
    }
    private boolean linear(int n){
        if(n==1) return true;
        if(n<=0) return false;
        if(n%2!=0) return false;
        boolean clone=linear(n/2);
        
        return clone; 
    }
}